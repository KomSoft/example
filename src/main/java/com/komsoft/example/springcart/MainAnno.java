package com.komsoft.example.springcart;

import com.komsoft.example.springcart.entity.Customer;
import com.komsoft.example.springcart.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* Создать спринговский проект с двумя методами мейн.
* При запуске первого мейна активируется конфигурация через хмл, второго - конфигурация через аннотации.
* Приложение выводит содержимое корзины товаров у покупателя.
* В мейне извлекается только один бин Customer, остальные DI обеспечиваются спрингом.
* Структуры классов:
*       Product- id, name, price;
*       Cart: maxSize, map of Products (<Product, Integer>);
*       Customer: name, Cart
*/
public class MainAnno {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app-springcartanno.xml");
        Customer customer = context.getBean(Customer.class);
        customer.setName("Customer");
        customer.getCart().put(new Product("Cat", 2.5), 5);
        customer.getCart().put(new Product("Dog", 3.5), 2);
        System.out.println(customer);

    }
}
