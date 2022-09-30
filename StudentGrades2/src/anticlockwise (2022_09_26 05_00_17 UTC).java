import java.util.*;
public class anticlockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] numbers = new int[row][row];
        int i;
        int j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < row; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            System.out.print(numbers[i][0] + " ");
        }
        for (j = 1; j < row; j++) {
            System.out.print(numbers[row - 1][j] + " ");
        }
        for (i = row - 2; i >= 0; i--) {
            System.out.print(numbers[i][row - 1] + " ");
        }
        for (j = row - 2; j >= 1; j--) {
            System.out.print(numbers[0][j] + " ");


//            for (j = 0; j < colm; j++) {
//                System.out.print(numbers[0][j] + " ");
//            }
//            for ( i = 1; i < row - 1; i++) {
//                System.out.print(numbers[i][colm - 1] + " ");
//            }
//            for (j = colm; j > 0; j--) {
//                System.out.print(numbers[row - 1][j - 1] + " ");
//            }
//            for ( i = row - 1; i > 1; i--) {
//                System.out.print(numbers[i - 1][0] + " ");
//            }
//        }
//        System.out.println();
//    }
//}
        }
    }
}
