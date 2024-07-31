package patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=1;i<=2*n-1;i++){
            int stars = (i<=n)?i:2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


// alternate way that is splitting the pattern into two and printing it

////printing the first half
//        for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//        System.out.print("* ");
//            }
//                    System.out.println();
//        }
//                //printing the second half
//                for(int i=1;i<n;i++){
//        for(int j=1;j<n-i+1;j++){
//        System.out.print("* ");
//            }
//                    System.out.println();
//        }