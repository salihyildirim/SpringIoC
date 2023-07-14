package com.example.springIoCWithXml.Dao;

public class CustomerDao implements ICustomerDao{
    @Override
    public void add(){
        System.out.println("Oracle Veritabanına eklendi");
    }
}
