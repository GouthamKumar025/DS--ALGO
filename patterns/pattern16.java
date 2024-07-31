package patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = -n + 1;i<n;i++){
            int absI = Math.abs(i);
            //for printing the space
            for(int j=0;j<absI;j++){
                System.out.print(" ");
            }
            //for printing the star
            for(int j=0;j < n - absI; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
