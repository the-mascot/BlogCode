package com.sample.soap.service;

import javax.jws.WebService;

import com.sample.soap.dto.SampleSoapDto;

@WebService
public interface SampleSoap {
	String hello(String name);
	String register(SampleSoapDto sampleSoapDto);
}
