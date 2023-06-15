import java.util.Scanner;

/** Q1 : Given an integer, find out the sum of its digits using recursion.
 Input: n= 1234
 Output: 10
 Explanation: 1+2+3+4=10 */

public class Question1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num to find sum of its digits: ");
        int x = in.nextInt();

        System.out.println(SumOfDigits(x));
    }

    public static int SumOfDigits(int  n)
    {
        int last = n%10;
        if( n < 10)
        {  return n; }

        else
        {
            return last + SumOfDigits(n/10);
        }
    }
}
