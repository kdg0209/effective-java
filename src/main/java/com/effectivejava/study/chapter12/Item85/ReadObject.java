package com.effectivejava.study.chapter12.Item85;

import java.io.*;

public class ReadObject {

    public static final String FILE_PATH = "src/member.txt";

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Member member = (Member) ois.readObject();
            System.out.println(member);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
