package com.effectivejava.study;

import com.effectivejava.study.chapter01.item01.SmartPhone;
import com.effectivejava.study.chapter01.item01.SmartPhoneFactory;
import com.effectivejava.study.chapter01.item01.Type;
import com.effectivejava.study.chapter01.item02.MexicoPizza;
import com.effectivejava.study.chapter01.item02.NewYorkPizza;
import com.effectivejava.study.chapter01.item02.Pizza;
import com.effectivejava.study.chapter01.item02.User;
import com.effectivejava.study.chapter01.item04.Animal;
import com.effectivejava.study.chapter01.item04.Dog;
import com.effectivejava.study.chapter01.item06.AutoBoxing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        System.out.println(AutoBoxing.sum());
    }
}
