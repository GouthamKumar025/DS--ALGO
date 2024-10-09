//https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1


class Solution {
    static int getLastDigit(String a, String b) {
        // code here
        if(b.equals("0") && b.length() == 1){
            return 1;
        }
        if (a.equals("0")) {
            return 0;
        }
        if(a.equals("1")){
            return 1;
        }
        
        int lastDigitA = Character.getNumericValue(a.charAt(a.length()-1));
        
        int [] [] cycledigits = {
            {},
            {1},
            {2,4,8,6},
            {3,9,7,1},
            {4,6},
            {5},
            {6},
            {7,9,3,1},
            {8,4,2,6},
            {9,1}
        };
        
        int [] cycle = cycledigits[lastDigitA];
        
        int cycle_length = cycle.length;
        
        int exponent = modulo(b,cycle_length);
        
        if(exponent == 0){
            exponent = cycle_length;
        }
        
        return cycle[exponent - 1];
        
    }
    
    static int modulo(String b, int cycle_length){
        
        int res = 0;
        
        for(int i=0;i<b.length();i++){
            res = (res * 10 + (b.charAt(i) - '0')) % cycle_length;
        }
        
        return res;
    }
    
};
