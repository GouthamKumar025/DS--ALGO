package Conditionals;
import java.util.*;
public class sum_natural {
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
