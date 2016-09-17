package com.lhh.car.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testBean() throws Exception {
		TestAction testAction = (TestAction) ac.getBean("testAction");
		System.out.println(testAction);
	}
	
	
	//测试sessionFactory
	@Test
	public void testSessionFactory() throws Exception {
		SessionFactory sf = (SessionFactory)ac.getBean("sessionFactory");
		System.out.println(sf);
	}
	
	//测试事务
	@Test
	public void testTransaction() throws Exception {
		TestService testService = (TestService) ac.getBean("testService");
		testService.saveTwoUsers();
	}

	
}
