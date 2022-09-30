import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int starting = 0;
        int last = array.length - 1;

        int mid = (starting + last) / 2;

        while (starting <= last) {
            if (array[mid] == k) {
                System.out.println(mid);
                break;
            } else if (array[mid] < k) {
                starting = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (starting+last)/2;
        }
        if(starting > last) {
            System.out.println("not found");
        }
    }
}
