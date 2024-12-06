class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(low,mid,arr);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid ++;
            }
            else{
                swap(mid,high,arr);
                high --;
            }
        }
    }

    public void swap(int a, int b, int[]arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
