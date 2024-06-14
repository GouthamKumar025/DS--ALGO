package methods;

public class prime {
    public static void main(String[] args) {
        boolean result = checkprime(45);
        System.out.println(result);
    }

    public static boolean checkprime(int number){
        if(number <= 1){
            return false;
        }
        else if(number == 2 || number == 3){
            return true;
        }
        else if(number % 2 == 0 || number % 3 == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
