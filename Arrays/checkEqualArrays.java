class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        HashMap<Integer,Integer>map1 = new HashMap<>();
        HashMap<Integer,Integer>map2 = new HashMap<>();
        
        for(int i: arr1){
            map1.put(i, map1.getOrDefault(i,0) + 1);
        }
        for(int j: arr2){
            map2.put(j, map2.getOrDefault(j,0) + 1);
        }
        
        if(map1.equals(map2)){
            return true;
        }
        return false;
        
    }
}
