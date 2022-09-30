import java.util.*;
public class bubblesortdiscendingorder {

//
        public static void main(String[] args) {
            // create Scanner class object to take input
            Scanner scan = new Scanner(System.in);

            // read size of the array
            System.out.print("Enter size of the array: ");
            int n = scan.nextInt();

            // create an int array of size n
            int numbers[] = new int[n];

            // take input for the array
            System.out.println("Enter array elements: ");
            for (int i = 0; i < n; ++i) {
                numbers[i] = scan.nextInt();
            }

            // display negative numbers
            seperate(numbers);

            // close Scanner
            scan.close();

        }

        // method to seperate +ve, -ve numbers
        public static void seperate(int[] numbers) {

            // variables
            int posCount = 0;
            int negCount = 0;
            int positive[] = null;
            int negative[] = null;

            // count positive and negative numbers
            for (int i : numbers) {
                if (i >= 0)
                    ++posCount;
                else
                    ++negCount;
            }

            // if array contains only positive or negative
            if (posCount == 0) {
                System.out.println("Array contains only negative numbers");
                // display array
                System.out.println("Array = " + Arrays.toString(numbers));
                return;
            } else if (negCount == 0) {
                System.out.println("Array contains only positive numbers");
                // display array
                System.out.println("Array = " + Arrays.toString(numbers));
                return;
            }
            // create positive and negative array
            positive = new int[posCount];
            negative = new int[negCount];

            // check element and insert
            int i = 0;
            int j = 0;
            for (int num : numbers) {
                if (num >= 0) {
                    positive[i++] = num;
                } else {
                    negative[j++] = num;
                }
            }

            // both arrays
            System.out.println("Negative numbers = "
                    + Arrays.toString(negative));
            System.out.println("Positive numbers = "
                    + Arrays.toString(positive));
        }
    }