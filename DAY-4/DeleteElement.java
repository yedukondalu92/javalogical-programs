import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Initialize array
        int[] array = new int[size];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Input position to delete
        System.out.print("Enter the position of the element to delete (0-based index): ");
        int position = scanner.nextInt();
        // Check if position is valid
        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the left from the specified position
            for (int i = position; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            // Print the array after deletion
            System.out.println("Array after deletion:");
            for (int i = 0; i < size - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
        
        scanner.close();
    }
}

