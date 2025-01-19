package com.brickcommander.crud.app.controller;

import com.brickcommander.crud.app.model.Customer;
import com.brickcommander.crud.app.model.Item;
import com.brickcommander.crud.app.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @Autowired
    BaseService baseService;

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return baseService.getCustomer(id);
    }

    @GetMapping("item/{id}")
    public Item getItem(@PathVariable Long id) {
        return baseService.getItem(id);
    }

    @PostMapping("addCustomer")
    public Boolean addCustomer(@RequestBody Customer customer) {
        return baseService.addCustomer(customer);
    }

    @PostMapping("addItem")
    public Boolean addItem(@RequestBody Item item) {
        return baseService.addItem(item);
    }
}
