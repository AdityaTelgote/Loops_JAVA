/*Question
 * Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	...
 * 
 */

package Aditya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter a non-negative integer (n) to calculate Fibonacci(n): ");
        n = scanner.nextInt();

        System.out.println("n\tFibonacci(n)");

        int first = 0, second = 1, count = 0;

        if (n >= 0) {
            do {
                System.out.println(count + "\t" + first);
                int next = first + second;
                first = second;
                second = next;
                count++;
            } while (count <= n);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        scanner.close();
    }
}

