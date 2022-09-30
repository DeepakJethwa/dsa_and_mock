import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            if(array[i]==x){
                System.out.println(i);
                temp++;
            }
        }
        if(temp==0){
            System.out.println("not found");
        }

    }
}
