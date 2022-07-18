package com.effectivejava.study.chapter01.item09;

import java.io.*;

public class StringUtils  implements AutoCloseable {

    private FileOutputStream fileOutputStream;

//    public String firstLineOfFileV2ineOfFileV1(String path, String fileName) throws IOException {
//        reader = new BufferedReader(new FileReader(path));
//
//        try {
//            OutputStream outputStream = new FileOutputStream(fileName);
//
//            try {
//                String s = reader.readLine();
//                outputStream.write(s.getBytes(), 0, s.length());
//            } finally {
//                outputStream.close();
//            }
//            return reader.readLine();
//        } finally {
//            reader.close();
//        }
//    }
//
//    public String firstLineOfFileV2(String path) {
//        try(FileOutputStream fileOutputStream = new FileOutputStream(path, true)) {
//            String strText = "안녕 세상!";
//            fileOutputStream.write(strText.getBytes());
//            return strText;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }

    public String firstLineOfFileV3(String path) throws IOException {
        fileOutputStream = new FileOutputStream(path, true);
        String strText = "안녕 세상!";
        fileOutputStream.write(strText.getBytes());
        return strText;
    }

    @Override
    public void close() throws Exception {
        if (fileOutputStream != null) fileOutputStream.close();
        System.out.println("closed!!");
    }
}
