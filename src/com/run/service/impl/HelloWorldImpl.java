package com.run.service.impl;

import javax.jws.WebService;

import com.run.service.IHelloWorld;

@WebService(endpointInterface = "com.run.service.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld{

	@Override
	public String sayHello(String text) {
//		text = "yl";
		return "Hello : " + text;
	}

}
