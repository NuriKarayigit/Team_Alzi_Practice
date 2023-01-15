package Week4JavaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDup(String str){
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(Arrays.toString(new Set[]{set}).replace("[","").replace("]","").replace(",","").replace(",",""));

return set.toString();



    }

    public static void main(String[] args) {
        removeDup("AAAABBBBCCCC");
    }

}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */