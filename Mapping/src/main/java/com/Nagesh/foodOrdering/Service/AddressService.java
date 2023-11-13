package com.Nagesh.foodOrdering.Service;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Repo.Irepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    Irepo iRepo;
    public String saveAdd(Address add) {
        iRepo.save(add);
        return"Now Added";
    }


    public List<Address> giveadd() {
        return iRepo.findAll();
    }
}
