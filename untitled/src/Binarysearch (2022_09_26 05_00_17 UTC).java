import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int starting = 0;
        int ending = array.length - 1;
        int mid = starting + (ending - starting) / 2;
        while (starting <= ending) {
            if (array[mid] == search) {
                System.out.println(mid);
                break;
            } else if
                (array[mid]<search){
                starting = mid+1;
                }
            else{
                ending = mid-1;
            }
            mid = starting + (ending - starting) / 2;

            }
        while(starting>ending){
            System.out.println("not found");
        }
        }
    }
