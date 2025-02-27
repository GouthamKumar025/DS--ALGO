
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
         
        for(int num: arr){
            if(num > max1){
                max3 = max2;
                max2 =max1;
                max1 =num;
            }
            else if(num >max2){
                max3 = max2;
                max2 =num;
            }
            else if(num > max3){
                max3 = num;
            }
        }
        
        return max3;
    }
}
