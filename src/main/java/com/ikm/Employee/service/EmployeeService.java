package  com.ikm.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikm.Employee.model.EmployeeModel;
import  com.ikm.Employee.repository.EmployeeRepository;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository emprep;
    

    public long createEmployee(EmployeeModel request){

         emprep.save(request);
        return request.getId(); 

        

    }
}
