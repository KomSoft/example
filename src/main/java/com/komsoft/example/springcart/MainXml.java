package com.komsoft.example.springcart;

import com.komsoft.example.springcart.entity.Customer;
import com.komsoft.example.springcart.entity.Product;
import com.komsoft.example.springcart.repository.ProductRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

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
public class MainXml {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-springcart.xml");
        Customer customer = context.getBean(Customer.class);

        final int LOOP_COUNT = 5;
        List<Product> products = context.getBean(ProductRepository.class).getAll();

        int count = new Random().nextInt(LOOP_COUNT) + 1;
        System.out.println(String.format("Add products %d times", count));
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(products.size());
            customer.getCart().put(products.get(index), i+1);
        }
        System.out.println(customer);
    }
}
