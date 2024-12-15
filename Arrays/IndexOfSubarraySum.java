class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer>result = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            // checking at the first subarray equals to the target
            if(sum == target){
                result.add(1);
                result.add(i+1);
                return result;
            }
            int rem = sum - target;
            if(map.containsKey(rem)){
                result.add(map.get(rem)+2);
                result.add(i+1);
                return result;
            }
            map.put(sum,i);
        }
        
       result.add(-1);
       return result;
    }
}





// Brute Force
// class Solution {
//     static ArrayList<Integer> subarraySum(int[] arr, int target) {
//         // code here
//         ArrayList<Integer>result = new ArrayList<>();
        
//         for(int i=0;i<arr.length;i++){
//             int sum = 0;
//             for(int j=i;j<arr.length;j++){
//                 sum += arr[j];
//                 if(sum == target){
//                     result.add(i+1);
//                     result.add(j+1);
//                     return result;
//                 }
//             }    
//         }
//         result.add(-1);
//         return result;
        
//     }
// }
