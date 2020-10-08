package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

    @Before("execution(* com.service.UserService.getUser())")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知...");
        //JoinPoint 通过该对象可以获取到被切入的对象的信息
        System.out.println("目标对象："+joinPoint.getTarget());
        System.out.println("方法签名："+joinPoint.getSignature());
        System.out.println("方法参数："+joinPoint.getArgs());
    }


}
