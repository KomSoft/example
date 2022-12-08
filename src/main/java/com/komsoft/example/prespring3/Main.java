package com.komsoft.example.prespring3;

import com.komsoft.example.prespring2.Dota2Configuration;
import com.komsoft.example.prespring2.Item;
import com.komsoft.example.prespring2.Pudge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context3.xml");
//        context.register(Dota2.class, Item.class, Pudge.class);
//        context1.register(Dota2Configuration.class, ItemConfiguration.class);

        System.out.println(context.getBean("pudge"));
        System.out.println(context.getBean("item"));
//        System.out.println(context.getBean("lineage"));
        System.out.println(context.getBean(Dota2.class));

    }
}
