package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.controller.HomeController;
import com.example.service.ServiceInterface1;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationInjectionMock {
	@InjectMocks
	private HomeController homeController=new HomeController();
	
	@Mock
	private ServiceInterface1 serviceInterface1;
	
	

@Test
public void retTest() throws Exception{
	//assertEquals(homeController.ret(),"hello from ret method");
	
	when(serviceInterface1.ret()).thenReturn("a");
	assertEquals(homeController.ret(),"a");
//	assertEquals(homeController.ret(),"a");
//	assertEquals(homeController.ret(),"a");
//	verify(serviceInterface1,times(3)).ret();
//	verify(serviceInterface1,never()).ret();
//	verify(serviceInterface1,atLeastOnce()).ret();
//	verify(serviceInterface1, atLeast(2)).ret();
//	verify(serviceInterface1,atMost(3)).ret();
	
	//verify(serviceInterface1,timeout(1)).ret();
}

@Test
public void addTest() throws Exception{
	
	when(serviceInterface1.add(10, 20)).thenReturn(30);
	assertEquals(homeController.add(10, 20),30);
	
	
}

	@Test(expected=Exception.class)
	public void checkException() throws Exception{
		
		 doThrow(new Exception("no implementation"))
         .when(serviceInterface1).add(10,20);

      //test the add functionality
      assertEquals(homeController.add(10, 20),30); 
		
	}


}
