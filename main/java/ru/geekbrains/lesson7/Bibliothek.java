package ru.geekbrains.lesson7;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Bibliothek {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Home");
        String s3 = new String(new char[]{'A','B','C'});
        String s4 = new String(s3);
        String s5 = new String(new byte[] { 0, 65, 0, 66, 0, 67});
        String s6 = new String(new byte[] { 0, 65, 0, 66, 0, 67}, StandardCharsets.UTF_16);
        String s7 = s2 + s1;
        String s8 = s7 + (20 + 2);
        String s9 = s7 + 219;
        String s10 = new String("Java");

        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s, s6 = %s, s7 = %s, s8 = %s, s9 = %s, s10 = %s ",
                s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);

        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        char[] c1 = s1.toCharArray();
        for (char c : c1) {
            System.out.println(c);

        }
        System.out.println(s1.equals(s10));
        System.out.println(s1 == s10);
        System.out.println(s1.concat(s2));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s1.toLowerCase(Locale.ROOT));

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = sb1.append(s2);

        sb1.append(s2);

        System.out.println(sb1);
        System.out.println(sb2.length());
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());
        sb2.setLength(30);
        System.out.println(sb2);

    }

}
