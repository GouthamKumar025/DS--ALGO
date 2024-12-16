class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compareResult(s).equals(compareResult(t));
    }

    public String compareResult(String str){
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch == '#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            }
            
        }
        return sb.toString();
    }
}
