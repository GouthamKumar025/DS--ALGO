class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n < 2){
            return n;
        }
        return (nthFibonacci(n-1) + nthFibonacci(n-2)) % 1000000007;
    }
}
