package com.example.springIoCWithXml.Dao;


public class MySqlCustomerDao implements ICustomerDao {

    @Override
    public void add() {
        System.out.println("Mysql eklendi.");
    }

}
