class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            
            if(currSum < arr[i]){
                currSum = arr[i];
            }
            
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
