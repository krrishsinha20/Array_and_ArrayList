/**
 * Name: Krrish Sinha
 * PRN: 23070126063
 * Batch: 2023-2027
 */

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // 1. Moving numbers to even and odd arrays
         System.out.print("Enter the number of elements: ");
         int n = scanner.nextInt();
         int[] numbers = new int[n];
 
         System.out.println("Enter " + n + " numbers:");
         for (int i = 0; i < n; i++) {
             numbers[i] = scanner.nextInt();
         }
 
         ArrayOperations.moveToEvenOddArrays(numbers);
 
         // 2. Finding neighboring numbers with smallest distance
         int index = ArrayOperations.findSmallestDistance(numbers);
         System.out.println("Index of first number in the smallest distance pair: " + index);
 
         // 3. Converting between array and ArrayList
         ArrayListOperations.convertArrayToListAndBack(numbers);
 
         scanner.close();
     }
 }
 