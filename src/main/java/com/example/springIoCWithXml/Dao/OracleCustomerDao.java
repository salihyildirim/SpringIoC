package com.example.springIoCWithXml.Dao;

public class OracleCustomerDao implements ICustomerDao{

    private String connectionString="sad";
    @Override
    public void add(){
        System.out.println("Oracle Veritabanına eklendi");
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

}
