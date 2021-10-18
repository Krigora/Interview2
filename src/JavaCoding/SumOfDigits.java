package JavaCoding;

public class SumOfDigits {
    /*
    Write a method that can return the sum of the digits in a string.
     */

    public static void main(String[] args) {
        System.out.println(sumOfDigit("12453"));
    }

    public static int sumOfDigit(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                int digitStr = Integer.parseInt(String.valueOf(ch));
                sum += digitStr;
            }
        }
        return sum;
    }
}
