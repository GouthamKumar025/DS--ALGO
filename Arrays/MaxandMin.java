class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return new Pair<>((long)min,(long)max);
    }
}