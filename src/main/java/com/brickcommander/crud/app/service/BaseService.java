package com.brickcommander.crud.app.service;

import com.brickcommander.crud.app.model.Customer;
import com.brickcommander.crud.app.model.Item;
import com.brickcommander.crud.app.repository.CustomerRepository;
import com.brickcommander.crud.app.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    private static final Logger logger = LoggerFactory.getLogger(BaseService.class);

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CustomerRepository customerRepository;

    public Boolean addCustomer(Customer customer) {
        try {
            customerRepository.save(customer);
            logger.info("Customer Saved.");
            return true;
        } catch (Exception e) {
            logger.info("Exception Occured {}", customer, e);
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
            logger.info("Exception Occured {}", item, e);
        }
        return false;
    }

    public Item getItem(Long itemId) {
        return itemRepository.findOneByItemId(itemId);
    }
}
