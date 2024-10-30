class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int low = Arrays.stream(arr).max().orElseThrow();
        int high = Arrays.stream(arr).sum();
        int ans = -1;
        while(low <= high){
            int mid = low +(high- low) / 2;
            if(findDays(arr,n,d,mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    static boolean findDays(int[]arr,int n, int d, int mid){
        int count = 1;
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
            if(total > mid){
                count++;
                total = arr[i];
            }
        }
        return count <= d;
    }
};
