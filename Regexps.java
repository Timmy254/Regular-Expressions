package com.pluralsight.myproject.practice;


import java.util.Scanner;

public class Overloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // read the number from the user.
        String[] values = new String[num];

        for (int i = 0; i < num; i++){
             values[i] = sc.next();

        }
        for (String value : values) {
            String param1 = "^[A-Z_a-z].*"; //check if it starts with an underscore or characters
            boolean determine = value.matches(param1);
            if (determine) {
                String param2 = "^_.*";
                boolean determine2 = value.matches(param2);
                if (determine2) {
                    String param3 = "^_[^_].*";
                    boolean determine3 = value.matches(param3);
                    if (!determine3) {
                        System.out.println(value);
                    } else
                        continue;
                } else {
                    continue;
                }
            } else
                System.out.println(value);
        }
    }
}