package javaapplication14;


public class JavaApplication14 {
    public static int evenFibonacciSum(int limit) {
        int sum = 0;
        int previous = 1;
        int current = 1;
        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current;
            }
            int next = previous + current;
            previous = current;
            current = next;
        }
        return sum;
    }
   
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = evenFibonacciSum(limit);
        System.out.println("The sum of all even-valued terms in the Fibonacci sequence up to " + limit + " is " + sum);
    }
    
}
