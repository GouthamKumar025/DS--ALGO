class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n - 1;
         while(j < k){
            int sum = arr[i] + arr[j] + arr[k];
            if(sum == x){
                return true;
            }
            else if(sum < x){
                j++;
            }
            else{
                k--;
            }
        }
        }
        
        
        return false;
    }
}
