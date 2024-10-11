class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            // swap(arr[i],arr[n-1])
        }
    }
}
