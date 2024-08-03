class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long num = n;
        long ans = 0;
        while(num>0){
            long rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return ans;
    }
}
