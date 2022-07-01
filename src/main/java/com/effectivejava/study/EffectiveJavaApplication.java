package com.effectivejava.study;

import com.effectivejava.study.chapter01.item01.SmartPhone;
import com.effectivejava.study.chapter01.item01.SmartPhoneFactory;
import com.effectivejava.study.chapter01.item01.Type;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        SmartPhone samsungSmartPhone = SmartPhoneFactory.create(Type.SAMSUNG);
        SmartPhone appleSmartPhone = SmartPhoneFactory.create(Type.APPLE);

        System.out.println(samsungSmartPhone.toString());
        System.out.println(appleSmartPhone.toString());
    }
}
