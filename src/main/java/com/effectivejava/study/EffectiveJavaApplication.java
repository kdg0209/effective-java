package com.effectivejava.study;

import com.effectivejava.study.chapter02.Item13.Product;
import com.effectivejava.study.chapter02.Item13.Products;
import com.effectivejava.study.chapter02.Item14.CaseInsensitiveString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        CaseInsensitiveString cis1 = new CaseInsensitiveString("Apple");
        CaseInsensitiveString cis2 = new CaseInsensitiveString("blue");
        CaseInsensitiveString cis3 = new CaseInsensitiveString("abuse");
        CaseInsensitiveString cis4 = new CaseInsensitiveString("Cream");

        TreeSet<CaseInsensitiveString> cisSet = new TreeSet<>();
        cisSet.add(cis1);
        cisSet.add(cis2);
        cisSet.add(cis3);
        cisSet.add(cis4);
        System.out.println(cisSet.toString());


        ArrayList<CaseInsensitiveString> cisList = new ArrayList<>();
        cisList.add(cis1);
        cisList.add(cis2);
        cisList.add(cis3);
        cisList.add(cis4);
        Collections.sort(cisList);
        System.out.println(cisList.toString());
    }
}
