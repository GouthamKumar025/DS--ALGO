class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == k){
                return true;
            }
            else if(arr[mid] < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
