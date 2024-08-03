class Solution
{
    String modify (String s)
    {
        // your code here
        char [] chars = s.toCharArray();
        char [] vowels = {'a','e','i','o','u'};
        ArrayList<Character>newarr = new ArrayList<>();

        for(char ch: chars){
            for(char vo: vowels){
                if(ch == vo){
                    newarr.add(ch);
                    break;
                }
            }
        }

        // reversing the array
        Collections.reverse(newarr);
        int i=0;
        for(int j=0;j< chars.length;j++){
            for(char vo: vowels){
                if(chars[j] == vo && i < newarr.size()){
                    chars[j] = newarr.get(i);
                    i++;
                    break;
                }
            }
        }

        return new String(chars);
        
    }
}
