package com.master.spring.spring2proj5.blc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numToSearchFor) {
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		// search logic
		return 2;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}
