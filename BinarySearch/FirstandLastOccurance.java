class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>ans = new ArrayList<Integer>();
        
        int firstPos = findFirst(arr,x);
        int lastPos = findLast(arr,x);
        
        if(firstPos == -1){
            ans.add(-1);
            ans.add(-1);
        }
        else{
            ans.add(firstPos);
            ans.add(lastPos);
        }
        return ans;
    }
    
    
    public static int findFirst(int arr[],int x){
        int start = 0;
        int end = arr.length -1;
        int result = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == x){
                result = mid;
                end = mid - 1;
            }
            else if(arr[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
    
    public static int findLast(int arr[],int x){
        int start = 0;
        int end = arr.length -1;
        int result = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == x){
                result = mid;
                start = mid + 1;
            }
            else if(arr[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
}
