package com.sample.soap.service;

import javax.jws.WebService;

import com.sample.soap.dto.SampleSoapDto;

@WebService(endpointInterface = "com.sample.soap.service.SampleSoap")
public class SampleSoapImpl implements SampleSoap {
	private int counter;
	
	public String hello(String name) {
		return "Hello " + name + "!";
	}
	
	public String register(SampleSoapDto sampleSoapDto) {
		counter++;
		return sampleSoapDto.getName() + "is registered student number " + counter;
	}
}
