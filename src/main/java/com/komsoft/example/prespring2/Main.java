package com.komsoft.example.prespring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context2.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(Dota2Configuration.class);
        System.out.println(context.getBean("item"));
        System.out.println(context.getBean("pudge"));
        System.out.println("---------------");
/*
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Dota2Configuration.class);
        context1.register(Dota2Configuration.class);
//        context1.register(Dota2Configuration.class, ItemConfiguration.class);
        context1.refresh();
        System.out.println(context.getBean(Item.class));
        System.out.println(context.getBean(Pudge.class));
*/



//        System.out.println(String.format("Pudge=%s", context.getBean("pudge")));
//        System.out.println(String.format("name=%s,   level=%d", (Pudge) context.getBean("Pudge").get));
    }


}
