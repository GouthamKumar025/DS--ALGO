class Solution {
    public static long seriesSum(int n) {
        // code here
       if(n<=0){
           return 0;
       }
       long sum = ((long) n *(n+1))/2;
       return sum;
    }
}
