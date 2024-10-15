class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
        int j = 1;
        for(int i=1;i<arr.size();i++){
            if(!arr.get(i-1).equals(arr.get(i))){
                arr.set(j, arr.get(i));
                j++;
            }
        }
        return j;
    }
}
