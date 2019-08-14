package com.master.spring.spring2proj5.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.master.spring.spring2proj5.annot.PersonDAO;
import com.master.spring.spring2proj5.blc.BinarySearchImpl;
import com.master.spring.spring2proj5.cdi.SomeCdiBusiness;
import com.master.spring.spring2proj5.xml.XmlPersonDAO;

public class Spring2proj5Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj5Application.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("XML Beans definition names{}", (Object) applicationContext.getBeanDefinitionNames());

			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", xmlPersonDAO);
			LOGGER.info("{}", xmlPersonDAO.getXmlJdbcConnection());

			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			LOGGER.info("{}", binarySearchImpl);
			LOGGER.info("{}", binarySearchImpl.binarySearch(new int[] { 1, 2 }, 1));

			SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
			LOGGER.info("{}", someCdiBusiness);
			LOGGER.info("{}", someCdiBusiness.getSomeCdiDao());

			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getJdbcConnection());
		}
	}

}
