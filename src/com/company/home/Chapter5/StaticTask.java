package com.company.home.Chapter5;

/**
 * Created by Itzhak-Miryam on 10.02.2016.
 */
public class StaticTask {

    private static String stringField = "stringField";
    private static String stringInStatic;

    private static void getNames(){
        System.out.println(stringField);
        System.out.println(stringInStatic);
    }

    static {
        stringInStatic = "stringInStatic";
    }

    public static void main(String[] args) {
        System.out.println("in MAIN");
        StaticTask.getNames();
        stringField = "newField";
        getNames();
    }

}
