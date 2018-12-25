package com.ydy.test;

import java.util.Vector;

/**
 * @author ydy
 * Create By ydy on 2018/7/18
 */
public class Test {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("JJ");
        vector.add("KK");
        vector.add("HH");
        vector.add("FF");

        for (String s : vector) {
            if (s.equals("HH")) {
                vector.remove(s);
            }
        }

        for (String s : vector) {
            System.out.println(s);
        }
    }
}
