package com.example.springIoCWithXml;

import com.example.springIoCWithXml.Dao.ICustomerDao;
import com.example.springIoCWithXml.Dao.MySqlCustomerDao;
import com.example.springIoCWithXml.Dao.OracleCustomerDao;
import com.example.springIoCWithXml.Services.CustomerService;
import com.example.springIoCWithXml.Services.ICustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIoCWithXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoCWithXmlApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//		ICustomerService customerService= context.getBean("customerService",ICustomerService.class);
//
//		//CustomerService customerService= new CustomerService(context.getBean("oracleCustomerDao", ICustomerDao.class));
//		customerService.add();
//
//		OracleCustomerDao customerDao = context.getBean("oracleCustomerDao",OracleCustomerDao.class);
//		System.out.println(customerDao.getConnectionString());
//		OracleCustomerDao oracleCustomerDao = new OracleCustomerDao();
//		System.out.println(oracleCustomerDao.getConnectionString());

		ICustomerDao mySqlCustomerDao= context.getBean("mySqlCustomerDao",MySqlCustomerDao.class);
		mySqlCustomerDao.add();



	}

}
