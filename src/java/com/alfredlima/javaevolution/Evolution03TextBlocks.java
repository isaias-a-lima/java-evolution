package com.alfredlima.javaevolution;

public class Evolution03TextBlocks {


    public static void main(String[] args) {

        //java 8
        String json = "{\n" +
                "  \"name\": \"Isaias\",\n" +
                "  \"age\": 40\n" +
                "}";

        System.out.println("JSON: " + json);

        //java 17
        String json2 = """
        {
          "name": "Isaias",
          "age": 40
        }
        """;

        System.out.println("JSON2: " + json2);
    }


}
