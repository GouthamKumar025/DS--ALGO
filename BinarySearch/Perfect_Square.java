class Solution {
    long floorSqrt(long n) {
        // Your code here
        if(n == 0 || n == 1){
            return n;
        }
        long start = 1;
        long end = n;
        long ans = 0;
        while(start <= end){
            long mid = (start+end) / 2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid < n){
                start = mid + 1;
                ans = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
