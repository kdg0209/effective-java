package com.effectivejava.study;

import com.effectivejava.study.chapter02.Item13.Product;
import com.effectivejava.study.chapter02.Item13.Products;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        Products products = new Products();
        products.push(new Product("그램", 100000));
        products.push(new Product("맥북", 200000));

        Products copyProducts = products.clone(); // 복시
        copyProducts.push(new Product("삼성", 500000));
        copyProducts.push(new Product("아이폰 미니 12", 100000));
        products.push(new Product("아이폰 맥스 12", 150000));

        products.pop();
        products.pop();
        copyProducts.pop();
    }
}
