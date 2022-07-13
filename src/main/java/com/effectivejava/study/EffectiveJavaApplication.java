package com.effectivejava.study;

import com.effectivejava.study.chapter02.Item13.Product;
import com.effectivejava.study.chapter02.Item13.Products;
import com.effectivejava.study.chapter02.Item14.CaseInsensitiveString;
import com.effectivejava.study.chapter03.Item16.ColorPoint;
import com.effectivejava.study.chapter03.Item16.Points;
import com.effectivejava.study.chapter03.Item17.ImmutablePoint;
import com.effectivejava.study.chapter03.Item17.Point;
import com.effectivejava.study.chapter03.Item18.CompositionInstrumentedSet;
import com.effectivejava.study.chapter03.Item18.InstrumentedHashSet;
import com.effectivejava.study.chapter03.Item19.Sub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.concurrent.CompletableFuture;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        Sub sub = new Sub();
        sub.overrideMe();
    }
}
