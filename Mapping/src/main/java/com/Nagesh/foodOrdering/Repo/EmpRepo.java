package com.Nagesh.foodOrdering.Repo;

import com.Nagesh.foodOrdering.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
}
