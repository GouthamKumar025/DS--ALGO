class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length - 1;
        return mergeSort(arr, 0, n);
    }
    
    static int mergeSort(int[]arr, int low, int high){
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        
        return count;
    }
    
    static int merge(int[]arr, int low, int mid, int high){
        int left = low;
        int right = mid +1;
        int count = 0;
        
        ArrayList<Integer>temp = new ArrayList<>();
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left ++;
            }
            else{
                temp.add(arr[right]);
                count += mid - left + 1;
                right ++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left ++;
        }
        
        while(right <= high){
            temp.add(arr[right]);
            right ++;
        }
        
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        
        return count;
        
    }
}
