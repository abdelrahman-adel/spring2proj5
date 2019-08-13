package com.master.spring.spring2proj5.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.master.spring.spring2proj5.xml.XmlPersonDAOa;

@Configuration
public class Spring2proj5Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj5Application.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAOa personDAO = applicationContext.getBean(XmlPersonDAOa.class);
			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		}
	}

}
