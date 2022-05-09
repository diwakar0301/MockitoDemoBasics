package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass1 implements ServiceInterface1{

	@Override
	public int add(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in add method of serviceClass1");
		return a+b;
	}

	@Override
	public String ret() throws Exception {
		// TODO Auto-generated method stub
	//	Thread.sleep(8000);
		System.out.println("in ret method of serviceClass1");
		return "hello from ret method";
	}

}
