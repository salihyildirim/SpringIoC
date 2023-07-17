package com.example.springIoCWithXml.Services;

import com.example.springIoCWithXml.Dao.ICustomerDao;
import com.example.springIoCWithXml.Dao.MySqlCustomerDao;
import com.example.springIoCWithXml.Dao.OracleCustomerDao;

public class CustomerService implements ICustomerService {
    private ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add() {
        customerDao.add();
    }

//SetterInjection
//    public void setCustomerDao(ICustomerDao customerDao) {
//        this.customerDao = customerDao;
//    }

}
