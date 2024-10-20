//https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        if(R == 0){
            return 1;
        }
        else if(R % 2 == 0){
            long y = power(N,R/2);
            return (y * y) % 1000000007;
        }
        long z = N * power(N,R-1);
        return z % 1000000007;
    }
}
