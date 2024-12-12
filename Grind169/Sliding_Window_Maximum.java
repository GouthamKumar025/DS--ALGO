class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] result = new int[n-k+1];
        int ro = 0;
        Deque<Integer>queue = new ArrayDeque<>();

        for(int i=0;i<n;i++){

            // remove the out of bounds numbers
            if(!queue.isEmpty() && queue.peek() == i-k){
                queue.poll();
            }
            // finding the maximum number by removing the minimum ones
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }

            // add the index to the queue
            queue.offer(i);
            
            // checking whether we have the correct window area to add up for the result
            if(i>=k-1){
                result[ro++] = nums[queue.peek()];
            }
        }
        return result;
    }
}
