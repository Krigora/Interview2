package JavaCoding;


import java.util.Arrays;

public class SameLetter {

        public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC" ));
        }
public static String removeDuplicate (String word){

        String str = "AAABBBCCC";
        String unique = "";

        for (int i = 0; i < str.length(); i++){
        if (!unique.contains("" + str.charAt(i))){
        unique += str.charAt(i);
        }
        }

        return unique;


        }


        }

