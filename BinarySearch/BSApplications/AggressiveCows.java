// Binary Search application problem - aggressive cows

class Solution {
    public static int solve(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans=  0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(canWePlace(stalls,k,mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    
    public static boolean canWePlace(int[]stalls, int cows, int mid){
        int cntCows = 1;
        int lastCow = stalls[0];
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - lastCow >= mid){
                cntCows++;
                lastCow = stalls[i];
            }
            if(cntCows >= cows){
                return true;
            }
        }
        return false;
    }
}
