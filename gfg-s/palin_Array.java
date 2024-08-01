class Solution {
    public static boolean palinArray(int[] arr) {
        // add code here.
        for(int num:arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
       return true;
    }
    
    public static boolean isPalindrome(int num){
        
        int original = num;
        int reverse = 0;
        
        while(num>0){
            reverse = reverse * 10 + (num%10);
            num /= 10;
        }
        return original == reverse;
    }
}
