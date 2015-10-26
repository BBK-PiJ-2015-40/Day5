
import java.util.Scanner;

public class N1_RecursiveA { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            /*
Recursive code, line by line
a)What number would the following method print on screen if you called printNumbers(6)?
void printNumbers(int n) {
if (n <= 0) {
return;
}
printLine(n);
printNumbers(n-2);
printNumbers(n-3);
printLine(n);
}
Do this exercise on paper. Then add this method to a Java Decaf program and check your answer.
*/
            printNumbers(6);
    }

    private static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n);
    }
}