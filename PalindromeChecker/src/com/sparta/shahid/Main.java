package com.sparta.shahid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Palindrome palindrome = new Palindrome();
        //palindrome.isPalindrome("bobo");
        String longest = palindrome.isLongestPalindrome("hi my name is shahid and bob and hooh");
        System.out.println("longest palindrome is .."+ longest);

    }
}
