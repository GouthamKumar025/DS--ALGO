package Basics;
import java.util.*;
public class whitespace {
    public static void main(String[] args) {
        //whitespace removal
        String name = "Goutham Kumar";
        System.out.println(name.replace(" ",""));

        // double to float
        double num = 74.2;
        float number = (float) num;
        System.out.println(number);

        //user age
        Scanner in = new Scanner(System.in);
        int birth_year = in.nextInt();
        System.out.println("your age is "+ (2024 - birth_year));


    }
}
