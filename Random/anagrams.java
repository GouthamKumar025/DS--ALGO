package WorkHall;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if(checkAnagrams(s1,s2)){
            System.out.println("Both are anagrams");
        }
        else{
            System.out.println("Not a anagrams");
        }
    }

    public static boolean checkAnagrams(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        return map.values().stream().allMatch(value -> value == 0);
    }
}
