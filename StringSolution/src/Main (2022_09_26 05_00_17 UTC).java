import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {12, 34, -20, 44 ,-10 ,56 ,-2 , 86, 12};
        int[] outputArray = sortByHeight(inputArray);

        for (int item : outputArray) {
            System.out.print(item + ", ");
        }
    }

    public static int[] sortByHeight(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                int temp = inputArray[j];
                if (temp >= 0) {
                    if (inputArray[j] > inputArray[j + 1] && inputArray[j + 1] >= 0) {
                        inputArray[j] = inputArray[j + 1];
                        inputArray[j + 1] = temp;
                    }
                }
            }
        }
        return inputArray;
    }
}