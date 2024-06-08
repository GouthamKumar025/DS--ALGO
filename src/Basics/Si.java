package Basics;
import java.util.*;
public class Si {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int t = in.nextInt();
        float r = in.nextFloat();

        double interest = (p * t * r) / 100;

        System.out.println("Calculated interest amount: " + interest);

    }
}
