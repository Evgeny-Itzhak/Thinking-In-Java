package com.company.home.tasksfrominteview;

/*  Написать метод, который определяет фразы-палиндромы.
*   Например, "А роза упала на лапу азора."
*/

public class PalindromeFounderTask {

    public static boolean isPalindrome(String inputText){

        String text = inputText.replaceAll("[^a-zA-Z0-9]","").toLowerCase().trim();

        int i=0;
        while(text.length()/2 > i){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                System.out.println("The text \"" + inputText + "\" is NOT a palindrome");
                return false;
            }
            i++;
        }

        System.out.println("The text \"" + inputText + "\" is a palindrome");
        return true;
    }

    public static void main(String[] args) {

        isPalindrome("abccba");
        isPalindrome("abcccba");
        isPalindrome("No lemon, no melon");
        isPalindrome("Top spot");
        isPalindrome("This is simple text is not a palindrome");
        isPalindrome("А роза упала на лапу азора.");

    }


}
