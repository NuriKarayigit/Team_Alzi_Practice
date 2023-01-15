package Week4JavaPractice;


/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class FrequencyOfCharacters {
    public static String frequencyOfCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (!(result.contains(str.charAt(i) + ""))) {
                result += "" + str.charAt(i) + frequency;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        frequencyOfCharacters("AAABBBCCC");
    }
}