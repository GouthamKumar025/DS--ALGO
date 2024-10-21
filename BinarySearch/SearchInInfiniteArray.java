public class Solution {

	public static long firstOne()
	{
	    // Write your code here.
        long start = 0;
        long end = 1;
        
        while(Runner.get(end) == 0){
            start = end;
            end = end * 2;
        }
        
        long ans = -1;
        while(start <= end){
            long mid = (start + end) / 2;
            if(Runner.get(mid) == 1){
                end = mid -1 ;
                ans = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
	}


}
