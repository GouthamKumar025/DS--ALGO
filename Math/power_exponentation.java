class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int r = (int)reverse(N);
        
        long mod = 1000000007;
        
        long result = 1;
        long base = N % mod;
        
        while(r > 0){
            if(r % 2 == 1){
                result = (result * base) % mod; 
            }
            r = r /2;
            base = (base * base) % mod;
        }
        return result;
        
    }
    
    long reverse(int r){
        int ans = 0;
        while(r > 0){
            ans = ans * 10 + (r %10);
            r/=10;
        }
        return ans;
    }
    

}
