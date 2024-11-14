import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the array size from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        // Initialize the array
        int[] array = new int[n];
        // Input elements in the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // Initialize max and min to the first element
        int max = array[0];
        int min = array[0];
        // Loop through the array to find max and min
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // Output the maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        scanner.close();
    }
}