package ru.mirea.task13.opt6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordChain {

    public static void main(String[] args) throws IOException {
        System.out.print("Имя файла: ");
        String fileName = new Scanner(System.in).nextLine().trim();
        String content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        String[] words = content.trim().split("\\s+");

        StringBuilder result = getLine(words);
        System.out.println(result.length() == 0 ? "Цепочку составить нельзя" : result);
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0 || words[0].isEmpty()) {
            return result;
        }
        boolean[] used = new boolean[words.length];
        int[] order = new int[words.length];
        for (int start = 0; start < words.length; start++) {
            used[start] = true;
            order[0] = start;
            if (extend(words, used, order, 1)) {
                for (int i = 0; i < order.length; i++) {
                    if (i > 0) {
                        result.append(' ');
                    }
                    result.append(words[order[i]]);
                }
                return result;
            }
            used[start] = false;
        }
        return result;
    }

    private static boolean extend(String[] words, boolean[] used, int[] order, int count) {
        if (count == words.length) {
            return true;
        }
        String last = words[order[count - 1]];
        char lastLetter = Character.toLowerCase(last.charAt(last.length() - 1));
        for (int i = 0; i < words.length; i++) {
            if (!used[i] && Character.toLowerCase(words[i].charAt(0)) == lastLetter) {
                used[i] = true;
                order[count] = i;
                if (extend(words, used, order, count + 1)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}
