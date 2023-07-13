package myproject;

public class Flooring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 12, 15, 27, 34, 52, 89 };
		int target = 16;  //floor --> greatest number which is smaller than or equal to target
		System.out.println(binarysearch_floor(a, target));

	}

	static int binarysearch_floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return end;


	}

}


 //Another method of finding the floor
/*static int findFloor(long arr[], int n, long x)
{
    int start=0;
    int end=n-1;
    int ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]<=x){
            ans=mid;
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return ans;
    
}*/
