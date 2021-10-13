package JavaCoding;

public class RemoveDuplicates {
    	public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String word){
        String letter = "";
        for (int i = 0; i < word.length(); i++){
            if (!letter.contains("" + word.charAt(i))){
                letter += "" + word.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < letter.length(); i++){
            int count = 0;
            for (int j = 0; j < word.length(); j++){
                if(letter.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            result += letter.charAt(i) + "" + count;
        }
        return result;
    }

}
