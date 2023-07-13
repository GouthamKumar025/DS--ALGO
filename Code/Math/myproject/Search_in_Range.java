package myproject;

public class Search_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]a= {27,42,12,-1,51,29};
        int target=12;
        System.out.println(search(a,target,1,3));
	}
	static boolean search(int[]arr,int target,int start,int end) {
		if(arr.length==0) {
			return false;
		}
		for(int i=start;i<end;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}

}
