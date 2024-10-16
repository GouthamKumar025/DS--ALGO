class Solution {

    // Using Hashmap TC - O(N)
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    // using candidate Elimination Algorithm - O(N) - https://leetcode.com/problems/majority-element/solutions/3676530/3-method-s-beats-100-c-java-python-beginner-friendly/
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int candidate = 0;

        for(int i=0;i<n;i++){
            if(count == 0){
                candidate = nums[i];
                count ++;
            }
            else if(candidate == nums[i]){
                count ++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
