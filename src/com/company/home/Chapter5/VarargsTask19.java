package com.company.home.Chapter5;

import java.util.Arrays;

/**
 * Created by Itzhak-Miryam on 10.02.2016.
 */
public class VarargsTask19 {

    private static void print(String... s){
        System.out.println(Arrays.toString(s));
        for (Object string : s){
            System.out.print(string + ", ");
        }
        System.out.println("\n");

    }

    public static void main(String... args) {

        System.out.println(Arrays.toString(args));
        print("1","2", "3");
        print(new String[]{"1","2","3","4","5"});
        print();
    }
}
