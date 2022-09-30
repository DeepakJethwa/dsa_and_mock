import java.util.Scanner;

public class FirstAndLastIndexOfDUplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int index1 =-1;
        int index2 = -1;

        for(int i=0;i<array.length;i++){
            if(array[i]== search && index1 == -1){
                index1 = i;
            }
            if(array[i] == search && index1 != -1){
                index2 =i;
            }
        }
        int total = (index2 -index1)+1;
        System.out.println(index1);
        System.out.println(index2);

    }
}
