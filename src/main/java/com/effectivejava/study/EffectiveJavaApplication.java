package com.effectivejava.study;

import com.effectivejava.study.chapter06.Item35.EnsembleV1;
import com.effectivejava.study.chapter06.Item35.EnsembleV2;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EffectiveJavaApplication {
    public static void main(String[] args) throws Exception {

        for(EnsembleV2 item : EnsembleV2.values()) {
            System.out.println(item.getNumberOfMusicians()); // 1 ~ 10까지 출력됨
        }
    }
}










