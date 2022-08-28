package com.effectivejava.study.chapter12.Item86;

import java.io.*;

public class Main {

    public static final String FILE_PATH = "src/child.txt";

    public static void main(String[] args) {

        Child child = readObject();
        System.out.println(child.getVersion() + ", " + child.getDefaultVersion());
    }

    private static void writeObject() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(new Child("2.0.0"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Child readObject() {
        Child child = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            child = (Child) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return child;
    }
}
