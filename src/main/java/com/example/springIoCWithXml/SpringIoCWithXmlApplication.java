package com.example.springIoCWithXml;

import com.example.springIoCWithXml.Dao.CustomerDao;
import com.example.springIoCWithXml.Services.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIoCWithXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoCWithXmlApplication.class, args);

		CustomerService customerService= new CustomerService(new CustomerDao());
		customerService.add();

	}

}
