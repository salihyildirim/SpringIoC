package com.example.springIoCWithXml.Services;

import com.example.springIoCWithXml.Dao.ICustomerDao;
import com.example.springIoCWithXml.Dao.MySqlCustomerDao;
import com.example.springIoCWithXml.Dao.OracleCustomerDao;
import org.springframework.context.annotation.Bean;

public class CustomerService implements ICustomerService {

    private final ICustomerDao customerDao;

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
