import java.util.Scanner;
public class NegativeElementCount {
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
        // Initialize counter for negative numbers
        int negativeCount = 0;
        // Loop through the array to count negative numbers
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                negativeCount++;
            }
        }
        // Output the count of negative numbers
        System.out.println("Total negative numbers: " + negativeCount);
        scanner.close();
    }
}