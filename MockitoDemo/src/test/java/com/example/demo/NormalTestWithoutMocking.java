package com.example.demo;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.controller.HomeController;


@RunWith(SpringRunner.class)
@SpringBootTest
public class  NormalTestWithoutMocking {

	@Autowired
	private HomeController homeController;
	
@Test
public void test() throws Exception {
	
	
	assertEquals(homeController.ret(),"hello from ret method");
}

	
}
