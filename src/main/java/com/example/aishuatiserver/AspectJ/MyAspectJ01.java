//package com.example.aishuatiserver.AspectJ;
//
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//@Aspect  //表示当前类是一个切面类
//@Component  //将对象交给IoC管理
//public class MyAspectJ01 {
//
//    /**
//     * 要增强目标对象的方法
//     * 指定目标对象
//     * 切入点表达式（复杂）
//     * 表示com.example.aishuatiserver.service包下的所有类的所有方法，参数为任意多个
//     */
////    @Before("execution(* com.example.aishuatiserver.service.*.*(..))")
//    @Before("execution(* set*(..))")
//    public void aspectjFunc1(){
//        System.out.println("before.....");
//    }
//}
