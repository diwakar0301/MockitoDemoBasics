package com.example.demo;




import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.controller.HomeController;
import com.example.service.ServiceInterface1;

import static org.mockito.BDDMockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoDemoApplicationTests {
	
	
	@InjectMocks
	private HomeController homeController=new HomeController();
	
	
	private ServiceInterface1 serviceInterface1=mock(ServiceInterface1.class);

	

/*
 * BDD - Behavior Driven Development
 */

@Test
public void test1() throws Exception {

	given(serviceInterface1.ret()).willReturn("d");
	
	assertEquals(homeController.ret(),"d");
}


	
}
