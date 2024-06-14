package methods;
import java.util.*;


public class joinarrays {
    public static void main(String[] args) {
        int[]array1 = {24,21,31,42,65};
        int[]array2 = {21,54,36,11,9};
        System.out.println(Arrays.toString(joinarrays(array1,array2)));
    }

    public static int[] joinarrays(int[] array1, int[] array2){
        int[] result = new int[array1.length + array2.length];
        int pos = 0;
        for(int element: array1){
            result[pos++] = element;
        }
        for(int element: array2){
            result[pos++] = element;
        }

        return result;
    }
}
