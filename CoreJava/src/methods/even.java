package methods;

import java.util.*;

public class even {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printeven(1, 50)));
    }

    public static int[] printeven(int start, int end) {
        int[] A = new int[25];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                A[index++] = i;
            }
        }
        return A;
    }
}

