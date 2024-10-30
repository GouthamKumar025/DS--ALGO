import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        if(boards.size() == 1){
            return boards.get(0);
        }
        int left = Collections.max(boards);
        int right = boards.stream().mapToInt(Integer::intValue).sum();
        
        while(left <= right){
            int mid = left + (right - left) / 2; 
            if(countPainters(boards,mid,k)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean countPainters(ArrayList<Integer>arr,int mid, int k){
        int count = 1;
        int total=  0;
        for(int i: arr){
            total += i;
            if(total > mid){
                total = i;
                count ++;
            }
            if(count > k){
                return false;
            }
        }
        return true;
    }
}
