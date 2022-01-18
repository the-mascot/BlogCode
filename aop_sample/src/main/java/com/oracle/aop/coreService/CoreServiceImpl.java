package com.oracle.aop.coreService;

import org.springframework.stereotype.Service;
import com.oracle.aop.aspect.AfterAdvice;

@Service
public class CoreServiceImpl implements CoreService {

	@Override
	public void start() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CoreServiceImpl start() 실행...");
	}

	@Override
	public void middle() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CoreServiceImpl middle() 실행...");
	}
	
	@AfterAdvice	// @AfterAdvice 사용
	@Override
	public void end() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CoreServiceImpl end() 실행...");
	}
}
