import java.util.HashMap;
import java.util.Scanner;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Initialize array
        int[] array = new int[size];
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // Calculate frequencies
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        // Print the frequency of each element
        System.out.println("Frequency of each element:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " occurs " + frequencyMap.get(key) + " times");
        }
        
        scanner.close();
}
}