import java.util.ArrayList;
import java.util.HashMap;
public class Solution {
	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
		ArrayList<Pair<Integer,Integer>>ans = new ArrayList<>();
		HashMap<Integer,Integer>map = new HashMap<>();

		for(int i=0;i<arr.size();i++){
			int complement = target - arr.get(i);
			if(map.containsKey(complement) && map.get(complement) > 0){
				ans.add(new Pair<>(complement,arr.get(i)));
				map.put(complement, map.get(complement)-1);
			}
			else{
			map.put(arr.get(i),map.getOrDefault(arr.get(i), 0) + 1);

			}
		}

		if(ans.isEmpty()){
			ans.add(new Pair<>(-1,-1));
		}

		return ans;
	}
}
