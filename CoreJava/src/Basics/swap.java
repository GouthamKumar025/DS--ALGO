package Basics;

public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // By using temporary variable
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

        // By using add and sub
        int x = 10;
        int y = 2;
        x = x + y;  // x = 12
        y = x - y; // y = 10;
        x = x - y; // x = 2;
        System.out.println(x +" "+ y);

        // By using multiply and division
        int s = 5;
        int r = 15;
        if(s == 0){
            r = 0;
            s = r;
        }
        else if(r == 0){
            s = 0;
            r = s;
        }
        else{
            s = r * s; // s = 75
            r = s / r; // r = 5
            s = s / r; // s = 15
        }
        System.out.println(s+" "+r);

        //By using Bitwise XOR

        int p = 10;
        int q = 5;
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;

        System.out.println(p+" "+q);
    }
}
