package com.company.home.tasksfrominteview;

/*
* Написать метод, который получает на вход интовое число и находит сумму всех его цифр.
*/

public class SummingNumbersTask {

    public static int sumNumbers(int numbers){

        int inputNumber = numbers;
        int result=0;

        while(numbers!=0){
            result+= numbers%10;
            numbers/=10;
        }

        System.out.println("\n*** Результат сложения чисел числа \""+ inputNumber + "\" = " + result);
        return result;
    }

    public static void main(String[] args) {
        sumNumbers(123456789);
    }

}
