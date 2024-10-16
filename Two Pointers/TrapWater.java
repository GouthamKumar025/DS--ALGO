class Solution {

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[]) {
        // Your code here
        int l = 0;
        int r = arr.length - 1;
        int maxL = Integer.MIN_VALUE;
        int maxR  =Integer.MIN_VALUE;
        long ans = 0;
        
        while(l < r){
            maxL = Math.max(maxL, arr[l]);
            maxR = Math.max(maxR, arr[r]);
            
            if(maxL < maxR){
                ans += (long) maxL - arr[l];
                l++;
            }
            else{
                ans += (long)maxR - arr[r];
                r--;
            }
            
        }
        return (long)ans;
    }
}
