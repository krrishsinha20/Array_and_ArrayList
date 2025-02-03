import java.util.Arrays;

public class ArrayOperations {

    // Method to classify numbers into even and odd arrays
    public static void moveToEvenOddArrays(int[] numbers) {
        int evenCount = 0, oddCount = 0;

        // Count even and odd numbers to allocate arrays
        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int eIndex = 0, oIndex = 0;

        // Fill the arrays
        for (int num : numbers) {
            if (num % 2 == 0) even[eIndex++] = num;
            else odd[oIndex++] = num;
        }

        System.out.println("Even Numbers: " + Arrays.toString(even));
        System.out.println("Odd Numbers: " + Arrays.toString(odd));
    }

    // Method to find the first index of neighboring numbers with the smallest distance
    public static int findSmallestDistance(int[] numbers) {
        if (numbers.length < 2) return -1;

        int minDistance = Math.abs(numbers[1] - numbers[0]);
        int minIndex = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i + 1] - numbers[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
