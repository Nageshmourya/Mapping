package com.Nagesh.foodOrdering.Service;

import com.Nagesh.foodOrdering.Model.Emp;
import com.Nagesh.foodOrdering.Repo.EmpRepo;
import com.Nagesh.foodOrdering.Repo.Irepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;
    public List<Emp> TellmeEmp() {
        return empRepo.findAll();

    }

    public String saveEmp(Emp em) {
        empRepo.save(em);
        return "Now Save Employee in Database";
    }
}
