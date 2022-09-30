import java.util.*;
public class AlternateMatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int matrix[][] = new int[row][row];
        int i;
        int j;
        for (i=0;i<row;i++){
            for(j=0;j<row;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum1 =0 , sum2 =0, count =0;
        for ( i = 0; i < row; i++) {
            for( j=0;j<row ;j++)
            {
                if (count % 2 == 0)
                    sum1 += matrix[i][j];
                else
                    sum2 += matrix[i][j];
                count++;
            }
        }
        System.out.println(sum1);
        System.out.print(sum2);

    }
}