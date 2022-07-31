package com.effectivejava.study.chapter07.Item45;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class StreamAnagrams {

    public static void main(String[] args) throws IOException {
        int minGroupSize = 4;
        final Map<String, Set<String>> groups = StreamAnagrams.getGroups("");

        for (Set<String> value : groups.values()) {
            if (value.size() >= minGroupSize) {
                System.out.println(value.size() + " : " + value);
            }
        }



    }

    public static Map<String, Set<String>> getGroups(String filePath) throws IOException {
        File dictionay = new File(filePath);
        Map<String, Set<String>> groups = new HashMap<>();

        try(Scanner s = new Scanner(dictionay)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unsued) -> new TreeSet<>())
                        .add(word);
            }
        }

        return groups;
    }

    private static String alphabetize(String word) {
        final char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
