package com.Nagesh.foodOrdering.Controller;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AddressController {
    @Autowired
    AddressService adService;
    @PostMapping("Insert/Add")
    public  String saveAdd(@RequestBody Address add){
        return adService.saveAdd(add);
    }
    @GetMapping("Show/All/Address")
    public List<Address> giveadd()
    {
        return adService.giveadd();
    }
}
