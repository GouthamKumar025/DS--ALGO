// T C - O(N)

class Solution {
    boolean twoSum(int arr[], int target) {
        // using hashmap - optimized
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
}


  // two - pointer approach - O(NLogN)
//   int i = 0, j = n-1;
//   while(i< j){
//       int sum = arr[i] + arr[j];
//       if(sum == target){
//           return true;
//       }
//       else if(sum < target){
//           i++;
//       }
//       else{
//           j --;
//       }
//   }
// return false;
  




    // normal loops - O(N^2)
    // boolean twoSum(int arr[], int target) {
    //     // code here
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i] + arr[j] == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
}
