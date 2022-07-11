package com.effectivejava.study;

import com.effectivejava.study.chapter02.Item13.Product;
import com.effectivejava.study.chapter02.Item13.Products;
import com.effectivejava.study.chapter02.Item14.CaseInsensitiveString;
import com.effectivejava.study.chapter03.Item16.ColorPoint;
import com.effectivejava.study.chapter03.Item16.Points;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        ColorPoint colorPoint = new ColorPoint();
        System.out.println(colorPoint.getPoint()); // ColorPoint.Point(x=1.2, y=1.5)


    }
}
