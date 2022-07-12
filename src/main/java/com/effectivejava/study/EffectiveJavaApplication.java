package com.effectivejava.study;

import com.effectivejava.study.chapter02.Item13.Product;
import com.effectivejava.study.chapter02.Item13.Products;
import com.effectivejava.study.chapter02.Item14.CaseInsensitiveString;
import com.effectivejava.study.chapter03.Item16.ColorPoint;
import com.effectivejava.study.chapter03.Item16.Points;
import com.effectivejava.study.chapter03.Item17.ImmutablePoint;
import com.effectivejava.study.chapter03.Item17.Point;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.concurrent.CompletableFuture;


@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EffectiveJavaApplication.class, args);

//        Point point = new Point(1.5, 6.6);
//
//        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
//            System.out.println("future1 Thread : " + Thread.currentThread().getName());
//            System.out.println(point);
//        });
//
//        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
//            System.out.println("future2 Thread : " + Thread.currentThread().getName());
//            point.x += 10;
//            System.out.println(point);
//        });
//
//        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2);
//        allOf.get();

        ImmutablePoint immutablePoint = ImmutablePoint.valueOf(1, 2);

        CompletableFuture future1 = CompletableFuture.runAsync(() -> {
            System.out.println("future1 Thread : " + Thread.currentThread().getName());
            System.out.println("future1 immutablePoint : " + immutablePoint);
        });

        CompletableFuture future2 = CompletableFuture.runAsync(() -> {
            System.out.println("future2 Thread : " + Thread.currentThread().getName());
            System.out.println("future2 immutablePoint : " + immutablePoint.valueOf(11, 12));
        });

        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2);
        allOf.get();
    }
}
