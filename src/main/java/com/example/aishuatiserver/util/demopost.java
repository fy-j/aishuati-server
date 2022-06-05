//package com.example.aishuatiserver.util;
//
//
//
//import com.example.aishuatiserver.mapper.AdminMapper;
//import com.example.aishuatiserver.service.AdminService;
//import org.springframework.context.annotation.Condition;
//import org.springframework.context.annotation.ConditionContext;
//import org.springframework.core.type.AnnotatedTypeMetadata;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.util.HashMap;
//import java.util.Map;
//
//public class demopost implements Condition {
//
//    /**
//     *
//     * @param context 条件上下文
//     * @param metadata  注解元数据
//     * @return
//     * 返回true表示IoC容器加载该类型
//     * 返回false表示IoC容器不加载该类型
//     */
//    @Override
//    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Method[] methods = AdminService.class.getDeclaredMethods();
//        for(Method it:methods){
//            System.out.println(it.getName());
//        }
//        Proxy.newProxyInstance(AdminService.class.getClassLoader(), AdminService.class.getInterfaces(), new InvocationHandler() {
//            /**
//             *  当代理对象执行相关方法的时候
//             * @param proxy
//             * @param method
//             * @param args
//             * @return
//             * @throws Throwable
//             */
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                //调用被执行的方法
//                return null;
//            }
//        });
//    }
//}
