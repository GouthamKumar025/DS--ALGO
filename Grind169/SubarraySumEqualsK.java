class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            int remove = prefixSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }   
        return count;
    }
}