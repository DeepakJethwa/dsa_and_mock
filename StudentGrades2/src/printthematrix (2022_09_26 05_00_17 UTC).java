import java.util.*;
public class printthematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int matrix [][] = new int[row][row];
        for (int i=0; i<row;i++){
            for(int j=0;j<row;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<row;i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
