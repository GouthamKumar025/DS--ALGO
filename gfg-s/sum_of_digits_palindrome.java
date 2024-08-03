class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        //calculating the sum of the digits
        int sum = 0;
        int num = n;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        
        // checking palindrome
        int original = sum;
        int reverse = 0;
        while(original > 0){
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        
        if(sum == reverse){
            return 1;
        }
        return 0;
    }
}
