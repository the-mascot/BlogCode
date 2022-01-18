package com.oracle.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.oracle.aop.coreService.CoreService;

@Component
public class RunApplication implements ApplicationRunner {
	
	@Autowired
	CoreService coreService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		coreService.start();
		coreService.middle();
		coreService.end();
		
	}
	
}
