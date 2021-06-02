package com.jeeweixin.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jeeweixin.web.Application;

/**
 * @author QiCong
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class })
public class TabelBeanTest {

	Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Test
	public void getByUsername() {
		
	}

}

