//package com.example.springmvc.config;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
////創建一個繼承自 AbstractDispatcherServletInitializer (servlet容器初始化的配置類) 的class 並 把交給spring mvc
//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {// 加載容器對象 spring
//        AnnotationConfigWebApplicationContext ctx =new AnnotationConfigWebApplicationContext();
//        System.out.println("設置context");
//        ctx.register(SpringMVCConfig.class);
//        return  ctx;
//    }
//    //哪些request給spring mvc處理
//    //判斷哪些request給spring處理
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {//
//        return null;
//    }
//}
