
import java.util.Scanner;

public class N2_3_Fibonacci { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            /*
2.2 b) Fibonacci
Write a small program with a method that calculates the nth element of the Fibonacci sequence as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memorization. Compare the time that is needed in each case
to find F(40) or F(45).
*/
            System.out.println (fib(5));
    }

    private static int fib(int n) 
{
        if ((n == 1) || (n == 2)) 
	{
            return 1;
        } 
	
	else 
	{
            int result = fib(n-1) + fib(n-2); 
	return result;
        }
    }
}