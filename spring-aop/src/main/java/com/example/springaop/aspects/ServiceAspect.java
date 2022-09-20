package com.example.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {


    //direkt olarak hangi pakedin altındakı hangi metotların çalışmasını fitreledim
    @Before("execution(* com.example.springaop.services.MessageService.getMessage(..))")
    public void beforeFromMethods (JoinPoint joinPoint) {
        System.out.println("Before from method: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }


    //service pakedinin altında bulunan her sınıf ve o sınıfların içindeki her metot için çalışır.
    @After("execution(* com.example.springaop.services.*.*(..))")
    public void afterFromMethods (JoinPoint joinPoint) {
        System.out.println("After from method:  " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}