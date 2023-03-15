
package javaapplication15;
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the array
        int[] arr = new int[15];

        // Fill the array with user input
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print the array
        System.out.println("Array elements: " + Arrays.toString(arr));

        // Check if a number is present in the array
        System.out.print("Enter a number to search in the array: ");
        int searchNum = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == searchNum) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Create another array in reverse order
        int[] reversedArr = new int[15];
        for (int i = 0; i < 15; i++) {
            reversedArr[i] = arr[14 - i];
        }

        // Print the reversed array
        System.out.println("Reversed array elements: " + Arrays.toString(reversedArr));

        // Calculate the sum and product of array elements
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            product *= arr[i];
        }

        // Print the sum and product
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);

        scanner.close();
    }
}


