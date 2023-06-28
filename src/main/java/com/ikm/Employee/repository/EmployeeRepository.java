package com.ikm.Employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikm.Employee.model.EmployeeModel;

@Repository

    public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

}
    

