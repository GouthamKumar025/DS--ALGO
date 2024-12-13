import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int majorityElement(ArrayList<Integer> nums) 
    {
        //    Write your code here.
        int candidate = 0;
        int count = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == candidate){
                candidate = nums.get(i);
                count++;
            }
            else if(count == 0){
                candidate = nums.get(i);
                count++;
            }
            else{
                count --;
            }
        }
        return candidate;
    }
}
