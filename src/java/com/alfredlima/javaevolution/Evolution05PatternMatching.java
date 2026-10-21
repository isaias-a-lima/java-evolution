package com.alfredlima.javaevolution;

/**
 * Pattern Matching for instanceof
 * Java 16
 */
public class Evolution05PatternMatching {

    public static void main(String[] args) {

        String object = "Test";

        //Java 8
        if (object instanceof String) {
            String value = (String) object;
            System.out.println("Java 8 \n" + value.length());
        }

        //Java 16
        if (object instanceof String value2) {
            System.out.println("Java 16 \n" + value2.length());
        }
    }
}
