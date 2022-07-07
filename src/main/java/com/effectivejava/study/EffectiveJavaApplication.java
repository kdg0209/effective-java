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
import com.effectivejava.study.chapter01.item08.Room;
import com.effectivejava.study.chapter01.item09.StringUtils;
import com.effectivejava.study.chapter02.Item10.*;
import com.effectivejava.study.chapter02.Item11.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        PhoneNumber phoneNumber1 = new PhoneNumber("010", "1234", "5678");
        PhoneNumber phoneNumber2 = new PhoneNumber("010", "1234", "5678");
        PhoneNumber phoneNumber3 = new PhoneNumber("011", "1234", "5678");

        System.out.println(phoneNumber1.equals(phoneNumber2)); // true
        System.out.println(phoneNumber1.equals(phoneNumber3)); // false

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(phoneNumber1, "홍길동");

        System.out.println(map.get(phoneNumber1)); // 홍길동
        System.out.println(map.get(phoneNumber2)); // 홍길동
        System.out.println(map.get(phoneNumber3)); // null
    }
}
