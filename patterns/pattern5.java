public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            //printing the space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //printing the star
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            //printing the space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
