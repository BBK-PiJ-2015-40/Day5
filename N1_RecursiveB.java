
import java.util.Scanner;

public class N1_RecursiveB { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            /* b)
Do you see anything wrong with the following code? How would you fix it?
String buggyMethod(int n) {
if (n == 0) {
return "";
}
return n + " " + buggyMethod(n - 2);
}
*/
            buggyMethod(3);
    }

    private static String buggyMethod(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " " + buggyMethod(n - 2));
    }
}