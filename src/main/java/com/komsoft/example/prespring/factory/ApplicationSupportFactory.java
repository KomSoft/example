package com.komsoft.example.prespring.factory;

import com.komsoft.example.prespring.MessageProvider;
import com.komsoft.example.prespring.MessageRenderer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class ApplicationSupportFactory {
    private static ApplicationSupportFactory instance;
    private MessageProvider messageProvider;
    private MessageRenderer messageRenderer;

    private ApplicationSupportFactory() {
        Properties properties = new Properties();
        try {
//            ResourceBundle bundle = ResourceBundle.getBundle("applicationsupportfactory");
            properties.load(new FileInputStream(new File("D:/JavaWeb/example/src/main/java/com/komsoft/example/prespring/factory/application.properties")));
            String provider = properties.getProperty("provider");
            String renderer = properties.getProperty("renderer");
//            System.out.println(String.format("provider=%s,    rendere=%s", provider, renderer));
            messageProvider = (MessageProvider) Class.forName(provider).getDeclaredConstructor().newInstance();
            messageRenderer = (MessageRenderer) Class.forName(renderer).getDeclaredConstructor().newInstance();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    };

    public static ApplicationSupportFactory getInstance() {
        if (instance == null) {
           instance = new ApplicationSupportFactory();
            }
        return instance;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }

    //    D:\JavaWeb\prespring\src\main\java\com\example\prespring\factory\application.properties
}
