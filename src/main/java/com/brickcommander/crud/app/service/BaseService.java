package com.brickcommander.crud.app.service;

import com.brickcommander.crud.app.model.Customer;
import com.brickcommander.crud.app.model.Item;
import com.brickcommander.crud.app.model.ItemDetail;
import com.brickcommander.crud.app.model.Purchase;
import com.brickcommander.crud.app.model.helper.AddPurchaseRequest;
import com.brickcommander.crud.app.model.helper.ItemDetailLite;
import com.brickcommander.crud.app.repository.CustomerRepository;
import com.brickcommander.crud.app.repository.ItemRepository;
import com.brickcommander.crud.app.repository.PurchaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaseService {
    private static final Logger logger = LoggerFactory.getLogger(BaseService.class);

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    PurchaseRepository purchaseRepository;

    public Purchase getPurchase(Long purchaseId) {
        logger.info("getPurchase : {}", purchaseId);
        Purchase purchase = purchaseRepository.findOneByPurchaseId(purchaseId);
        logger.info("getPurchase : {}", purchase);
        return purchase;
    }

    public Boolean addPurchase(AddPurchaseRequest addPurchaseRequest){
        try {
            List<ItemDetail> itemDetailList = new ArrayList<>();
            for(ItemDetailLite itemDetailLite : addPurchaseRequest.getItemDetailLiteList()) {
                Item item = itemRepository.findOneByItemId(itemDetailLite.getItemId());
                item.setRemainingCount(item.getRemainingCount() - itemDetailLite.getItemQuantity());
                ItemDetail itemDetail = new ItemDetail(item, itemDetailLite.getSellingPrice(), itemDetailLite.getItemQuantity(), itemDetailLite.getItemQuantityQ());
                itemDetailList.add(itemDetail);
            }

            Customer customer = customerRepository.findOneByCustomerId(addPurchaseRequest.getCustomerId());
            customer.setTotalAmount(customer.getTotalAmount() + addPurchaseRequest.getPurchaseAmount());

            Purchase purchase = new Purchase();
            purchase.setPurchaseAmount(addPurchaseRequest.getPurchaseAmount());
            purchase.setCustomer(customer);
            purchase.setItemDetailList(itemDetailList);

            logger.info("addPurchase : saving : {}", purchase);
            purchaseRepository.save(purchase);
            return true;
        } catch (Exception e) {
            logger.error("addPurchase : {} : Exception Occured", addPurchaseRequest, e);
        }
        return false;
    }

    public Boolean addCustomer(Customer customer) {
        try {
            customerRepository.save(customer);
            logger.info("Customer Saved.");
            return true;
        } catch (Exception e) {
            logger.error("addCustomer : Exception Occured {}", customer, e);
        }
        return false;
    }

    public Customer getCustomer(Long customerId) {
        logger.info("getCustomer : id={}", customerId);
        Customer res = customerRepository.findOneByCustomerId(customerId);
        logger.info("getCustomer : res={}", res);
        return res;
    }

    public Boolean addItem(Item item) {
        try {
            itemRepository.save(item);
            logger.info("Item Saved.");
            return true;
        } catch (Exception e) {
            logger.error("addItem : Exception Occured {}", item, e);
        }
        return false;
    }

    public Item getItem(Long itemId) {
        return itemRepository.findOneByItemId(itemId);
    }
}
