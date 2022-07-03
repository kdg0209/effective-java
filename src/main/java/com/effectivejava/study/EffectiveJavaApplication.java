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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        // 아무리 기다려도 run() 메서드 호출 안됨
        new Room(99);
        System.out.println("아무렴");

        // run() 메서드 정상적으로 호출됨
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
