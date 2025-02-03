import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOperations {

    // Convert array to ArrayList and back
    public static void convertArrayToListAndBack(int[] numbers) {
        // Convert array to ArrayList
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }
        System.out.println("ArrayList: " + numberList);

        // Convert ArrayList back to array
        int[] newArray = numberList.stream().mapToInt(i -> i).toArray();
        System.out.println("Converted Array: " + Arrays.toString(newArray));
    }
}
