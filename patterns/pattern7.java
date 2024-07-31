package patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=  in.nextInt();
        for(int i=0;i<n;i++){
            //first space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //pattern
            for(int j=0;j<i*2+1;j++){
                System.out.print("* ");
            }
            //second space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
