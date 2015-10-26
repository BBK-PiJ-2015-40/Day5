
import java.util.Scanner;

public class N2_1_Factorial { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            /* recursively */
            System.out.println(factorial(5));
    }

    private static int factorial(int n) 
{
        if (n == 1)
	{
            return 1;
        } 
	else 
	{
            int result = n * factorial(n-1);
            return result;
        }
    }
}