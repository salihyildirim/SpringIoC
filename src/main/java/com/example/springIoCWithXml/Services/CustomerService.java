package com.example.springIoCWithXml.Services;

import com.example.springIoCWithXml.Dao.CustomerDao;
import com.example.springIoCWithXml.Dao.ICustomerDao;

public class CustomerService {
    ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add(){
        customerDao.add();
    }

}
