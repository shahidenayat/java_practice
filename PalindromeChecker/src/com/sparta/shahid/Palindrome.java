package com.sparta.shahid;

public class Palindrome {

    public boolean isPalindrome(String palindrome) {

        for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
            if (palindrome.charAt(i) != palindrome.charAt(j)) {
                return false;
            }
        }
        return true;
    }




    public String isLongestPalindrome(String palindrome){
        int temp = 0;
        String temp1 = "";
        String[] palindromeSplit = palindrome.split(" ");
        for (int i = 0; i < palindromeSplit.length;i++){
            if(isPalindrome(palindromeSplit[i])){
                if(palindromeSplit[i].length() > temp){
                    temp = palindromeSplit[i].length();
                    temp1 = palindromeSplit[i];
                }
            }
        }
        return temp1;
    }


}
