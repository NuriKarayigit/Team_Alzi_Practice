package Week4JavaPractice;

import java.util.*;

public class SameLetters {

    public static boolean sameLetters(String str1, String str2) {

        char[] firstStr = str1.toCharArray();
        char[] secondStr = str2.toCharArray();

        Arrays.sort(firstStr);
        Arrays.sort(secondStr);
        return Arrays.equals(firstStr, secondStr);

    }

    public static boolean sameLetters2(String word1, String word2) {

        word1 = new TreeSet<String>(Arrays.asList(word1.split(""))).toString();
        word2 = new TreeSet<String>(Arrays.asList(word2.split(""))).toString();

        System.out.println(word1.equals(word2));
        return word1.equals(word2);
    }

    public static void main(String[] args) {
        //System.out.println(sameLetters("abc", "cba"));
        sameLetters2("asdf", "fdsa");

    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */