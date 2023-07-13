package myproject;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FirstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
		  int target=10;
		  System.out.println(range(arr,target));
	}
	static int range(int[]arr,int target) {
		//first find thwithe range
		//first start  a box of size 2
		int start=0;
		int end=start+1;
		while(target>arr[end]) {
			int newstart=start=end+1;
			//find the end
			// new end=previous end+(2* box size)
			//box size = (end-start)+1
			end=end+((end-start)+1)*2;
			start=newstart;			
		}
		return binarysearch(arr,target,start,end);
	}
	static int binarysearch(int[] arr, int target,int start,int end) {
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
		return -1;

	}
}
