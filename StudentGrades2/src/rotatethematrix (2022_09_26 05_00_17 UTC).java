import java.util.Scanner;

public class rotatethematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int matrix[][] = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output 90 degree
        for (int i = 0; i < row; i++) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //output 180 degree
        for (int j = row - 1; j >= 0; j--) {
            for (int i = row-1; i >=0; i--) {
                System.out.print(matrix[j][i] + " ");

            }
            System.out.println();
        }
    }
}
    /*
    Sample Input
    2
        3 4
        7 6
        Sample Output
        7 3
        6 4

        6 7
        4 3


        */