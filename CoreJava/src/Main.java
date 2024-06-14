//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured " + e.getMessage());
        }
        finally {
            System.out.println("Result obtained");
        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}





// String Manipulation
//        String s = "Goutham";
//        String r = "Kumar";
//        System.out.println(s.charAt(2));
//        System.out.println(s.concat(r));
//        System.out.println(s.equals(r));
//        System.out.println(s.length());
//        System.out.println(s.replace('u','w'));
//        System.out.println(s.substring(0,4));
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.isEmpty());