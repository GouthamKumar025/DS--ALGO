class Solution {
    static String revStr(String s) {
        // code here
        char [] stringarr = s.toCharArray();
        int left = 0; 
        int right = stringarr.length - 1;
        
        while(left < right){
            char temp = stringarr[left];
            stringarr[left] = stringarr[right];
            stringarr[right] = temp;
            
            left ++;
            right --;
        }
        
        return new String(stringarr);
    }
}
