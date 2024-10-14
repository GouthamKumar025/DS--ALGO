
class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        int count = 0;
        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--){
            int lo = 0;
            int hi = i-1;
        while(lo<hi){
            int sum = arr[lo] + arr[hi];
            if(sum == arr[i]){
                count ++;
                lo ++;
                hi --;
            }
            else if(sum < arr[i]){
                lo++;
            }
            else{
                hi--;
            }
        }
        }
        
        return count;
        
    }
}
