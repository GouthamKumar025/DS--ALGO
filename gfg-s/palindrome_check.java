class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int original = n;
        int reverse = 0;
        while(original>0){
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        if(n == reverse){
            return "Yes";
        }
        return "No";
    }
}
