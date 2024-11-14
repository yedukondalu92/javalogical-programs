import java.util.Scanner;
public class EvenOddCount {
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
        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
        // Loop through the array to count even and odd numbers
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // Output the counts
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        scanner.close();
    }
}