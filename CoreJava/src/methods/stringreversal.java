package methods;

public class stringreversal {
    public static void main(String[] args) {
        String result = reverseString("Goutham");
        System.out.println(result);
    }


    // obtaining the string as input and converting it into a chararray
    // Then reverse the array using swapping each element
    // finally obtain the string by covnerting chararray into a new reversed string
    public static String reverseString(String str){
        char[]CharArray = str.toCharArray();
        int left = 0;
        int right = CharArray.length - 1;

        while (left < right){
            char temp = CharArray[left];
            CharArray[left] = CharArray[right];
            CharArray[right] = temp;

            left ++;
            right --;
        }

        return new String(CharArray);
    }
}
