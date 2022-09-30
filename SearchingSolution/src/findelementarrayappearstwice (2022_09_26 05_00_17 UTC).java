import java.util.Scanner;

public class findelementarrayappearstwice {
    static int findsingle(int []array1){

        int res = array1[0];
        for(int i=1;i<array1.length;i++){
            res = res^array1[i];
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array1[] = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println(findsingle(array1));
    }
}
