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
import com.effectivejava.study.chapter02.Item10.CaseInsensitiveString;
import com.effectivejava.study.chapter02.Item10.Color;
import com.effectivejava.study.chapter02.Item10.ColorPoint;
import com.effectivejava.study.chapter02.Item10.Point;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EffectiveJavaApplication.class, args);

//        CaseInsensitiveString cis = new CaseInsensitiveString("KDG");
//        String s = "KDG";
//
//        System.out.println(cis.equals(s)); // true
//        System.out.println(s.equals(cis)); // false
//
//        List<CaseInsensitiveString> list = new ArrayList<>();
//        list.add(cis);
//
//        System.out.println(list.contains(s)); // false, true, Exception
//
//        ColorPoint colorPoint = new ColorPoint(1, 2, Color.RED);
//        Point point = new Point(1, 2);
//
//        System.out.println(colorPoint.equals(point)); // false
//        System.out.println(point.equals(colorPoint)); // true

        ColorPoint a = new ColorPoint(1, 2, Color.RED);
        Point b = new Point(1, 2);
        ColorPoint c = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(a.equals(b)); //true
        System.out.println(b.equals(c)); //true
        System.out.println(a.equals(c)); //false
    }
}
