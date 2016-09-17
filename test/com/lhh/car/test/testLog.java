package com.lhh.car.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;




public class testLog {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Test
	public void test() throws Exception {
		log.debug("this is debug");
		log.info("this is info");
		log.warn("this is warn");
		log.error("this is error");
		log.fatal("this is fatal");
	}
}
