package patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            //for printing the space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //for printing the star
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        *****
//         ****
//          ***
//           **
//            *