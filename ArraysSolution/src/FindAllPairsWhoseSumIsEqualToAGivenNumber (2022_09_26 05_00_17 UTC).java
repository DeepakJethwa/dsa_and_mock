import java.util.Arrays;
import java.util.Scanner;
public class FindAllPairsWhoseSumIsEqualToAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int i =0;
        int j = array.length-1;

        while(i<j){
            if(array[i] + array[j] == k){
                System.out.println(array[i]+","+array[j]);
                i++;
                j--;
            }
            else if(array[i]+array[j]< k){
                i++;
            }
            else if(array[i]+ array[j]>k){
                j--;
            }
        }
    }
}
