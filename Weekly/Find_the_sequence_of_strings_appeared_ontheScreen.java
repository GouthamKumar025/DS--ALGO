class Solution {
    public List<String> stringSequence(String target) {
        List<String>result = new ArrayList<>();
        StringBuilder screen = new StringBuilder();

        for(char target_ch: target.toCharArray()){
            screen.append('a');
            result.add(screen.toString());

            while(screen.charAt(screen.length() - 1) != target_ch){
                char lastchar = screen.charAt(screen.length() - 1);
                lastchar =(char) ((lastchar - 'a' + 1) % 26 + 'a');
                screen.setCharAt(screen.length() -1,lastchar);
                result.add(screen.toString());
            }
        }
        return result;
    

    }
}
