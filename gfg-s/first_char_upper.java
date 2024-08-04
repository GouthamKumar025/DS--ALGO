import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String s = bf.readLine();
            System.out.println(transform(s));
        }
    }

    static String transform(String s){
        String [] arr = s.split(" ");
        StringBuilder transformed = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() > 0){
                char first_char = arr[i].charAt(0);
                char first_transform = Character.toUpperCase(first_char);
                arr[i] =  first_transform + arr[i].substring(1);
            }
            transformed.append(arr[i]);
            if(i < arr.length - 1) {
                transformed.append(" ");
            }
        }
        return new String(transformed);

    }
}
