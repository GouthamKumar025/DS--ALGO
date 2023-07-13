package myproject;

public class LowerBound {
     //lower bound---> smallest index which is greater than or equal to the target ::: arr[ind]>=target
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {1,2,3,3,5,8,8,10,10,11};
        int target=9;
        int n=arr.length;
        System.out.println(lowerbound(arr,target,n));
        
	}
	static int lowerbound(int[]arr,int target,int n) {
		int start=0;
		int end=n-1;
		int ans=n;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<=arr[mid]) {
				ans=mid;
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return ans;
	}

}
