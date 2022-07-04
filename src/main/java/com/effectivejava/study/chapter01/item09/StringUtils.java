package com.effectivejava.study.chapter01.item09;

import java.io.*;

public class StringUtils  {
    private BufferedReader reader;

    public String firstLineOfFileV1(String path, String fileName) throws IOException {
        reader = new BufferedReader(new FileReader(path));

        try {
            OutputStream outputStream = new FileOutputStream(fileName);

            try {
                String s = reader.readLine();
                outputStream.write(s.getBytes(), 0, s.length());
            } finally {
                outputStream.close();
            }
            return reader.readLine();
        } finally {
            reader.close();
        }
    }

    public String firstLineOfFileV2(String path) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(path, true)) {
            String strText = "안녕 세상!";
            fileOutputStream.write(strText.getBytes());
            return strText;
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public String firstLineOfFileV3(String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path, true);
        String strText = "안녕 세상!";
        fileOutputStream.write(strText.getBytes());
        return strText;
    }

}
