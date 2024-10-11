import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.

        k = k % arr.size();
        reverse(0,k-1,arr);
        reverse(k,arr.size()-1,arr);
        reverse(0,arr.size()-1,arr);

        return arr;
    }

    public static void reverse(int start,int end, ArrayList<Integer>arr){
        while(start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start ++;
            end --;
        }
    }
}
