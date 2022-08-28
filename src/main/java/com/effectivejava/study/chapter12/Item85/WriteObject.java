package com.effectivejava.study.chapter12.Item85;

import java.io.*;

public class WriteObject {

    public static final String FILE_PATH = "src/member.txt";

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
//            Member member = new Member("홀길동", 30);
//            oos.writeObject(member);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 직렬화
    private static void doSerializable(Member member) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(member);
        oos.close();
    }

    // 역직렬화
    private static Member doUnSerializable() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Member member = (Member) ois.readObject();
        ois.close();
        return member;
    }
}
