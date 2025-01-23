package WorkHall;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedChar {
    public static void main(String[] args) {
        String s = "GouthamKumarS";
        System.out.println(mostRepeated(s));
    }

    public static Character mostRepeated(String str){
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max = 0;
        char max_element = '0';
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                max_element = entry.getKey();
            }
        }
        return max_element;


    }
}
