package JavaCoding;

import java.util.Arrays;

public class SameLetters {

    /*
    •	Write a return method that check if a string is build out of the same letters as another string.
•	Ex:  same("abc",  "cab"); -> true
•	same("abc",  "abb"); -> false:

     */

        public static void main(String[] args) {
            System.out.println(sameLetter());
        }

        public static boolean sameLetter(){
            String first = "abc";
            String second = "cab";

            char[] firstArr = first.toCharArray();
            char[] secondArr = second.toCharArray();

            Arrays.sort(firstArr);
            Arrays.sort(secondArr);
            return Arrays.equals(firstArr,secondArr);
        }

    }


