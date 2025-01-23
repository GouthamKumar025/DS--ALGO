package WorkHall;

public class VowelRemoval {
    public static void main(String[] args) {
        String s = "Goutham";
        System.out.println(removeVowel(s));
    }

    public static String removeVowel(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

