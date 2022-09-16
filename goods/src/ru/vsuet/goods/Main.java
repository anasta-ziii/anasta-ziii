package ru.vsuet.goods;

import ru.vsuet.goods.domain.Department;
import ru.vsuet.goods.domain.Product;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Молоко");
        product.setCost(10);
        System.out.println(product);
        
        Department c = new Department();
        c.getDepartment ().add(product);
        System.out.println(c);
    }
}

