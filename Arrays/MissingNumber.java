class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int original_sum = (n *(n+1))/2;
        
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        
        return original_sum - sum;
    }
}
