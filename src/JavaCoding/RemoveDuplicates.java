package JavaCoding;

public class RemoveDuplicates {

    /*
   Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

    */
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
// updating

    }


}






