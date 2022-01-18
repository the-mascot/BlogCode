package com.oracle.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeLogger {
			// 경로 지정 방식
	@Around("execution(* com.oracle.aop..*.CoreService.*(..))")	// com.oracle.aop 폴더의 CoreService.java 클래스 모든 메서드 @Around 적용
	public Object timeLogger(ProceedingJoinPoint joinpoint) throws Throwable {
		
 		long startTime = System.currentTimeMillis();	// 시작 시간
		Object obj = joinpoint.proceed();				// 핵심업무 수행
		long endTime = System.currentTimeMillis();		// 종료 시간
		System.out.println("경과시간 : " + (endTime - startTime)+"milliSecond");
		
		return obj;
 	}
 	
	@Before("execution(* com.oracle.aop..*.CoreService.start(..))")	// com.oracle.aop 폴더의 CoreService.java 클래스 start() 메서드 @Before 적용
 	public void beforeAdvice() {
 		System.out.println("@Before");
 	}
 			// 어노테이션 지정 방식
	@After("@annotation(AfterAdvice)")	// @AfterAdvice로 핵심 관심사 메서드에서 정의하여 사용
 	public void afterAdvice() {
 		System.out.println("@After");
 	}
}