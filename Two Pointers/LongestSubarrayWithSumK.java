class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        HashMap<Integer,Integer>prevSumMap = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        
        for(int i=0;i<N;i++){
            sum += A[i];
             
            
            if(sum == K){
                maxlen = Math.max(maxlen, i+1);
            }
            
            int rem = sum - K;
            
            if(prevSumMap.containsKey(rem)){
                int len = i - prevSumMap.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            
            if(!prevSumMap.containsKey(sum)){
                prevSumMap.put(sum,i);
            }
        }
        return maxlen;
    }
}
