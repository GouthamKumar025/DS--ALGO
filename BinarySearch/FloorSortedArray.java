class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = n -1;
        while(start <= end){
            int mid = (start+end) /2;
            if(arr[mid] < x){
                start = mid + 1;
            }
            else if(arr[mid] > x){
                end = mid - 1; 
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
