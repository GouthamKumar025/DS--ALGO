package patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            //printing the space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //printing the pattern
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("* ");
            }
            //printing the space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
