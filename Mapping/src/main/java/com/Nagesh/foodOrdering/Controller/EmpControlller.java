package com.Nagesh.foodOrdering.Controller;

import com.Nagesh.foodOrdering.Model.Emp;
import com.Nagesh.foodOrdering.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpControlller {
    @Autowired
    EmpService empService;
    @GetMapping("Finf/all/emp")
    public List<Emp> TellmeEmp()
    {
        return empService.TellmeEmp();
    }
    @PostMapping("Insert/Emp")
    public String saveEmp( @RequestBody Emp em){
        return empService.saveEmp(em);
    }
}
