import java.util.Scanner;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int starting = 0;
        int last = array.length - 1;
        int mid = (starting + last) / 2;
        while (starting <= last) {
            if (array[mid] < array[mid + 1]) {
                starting = mid + 1;
                System.out.println(array[starting]);

            } else {
                last = mid;
            }
            mid = starting + (last - starting) / 2;
        }
        }
        }

