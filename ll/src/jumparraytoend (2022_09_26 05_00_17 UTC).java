import java.util.Scanner;

public class jumparraytoend {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int jump=0;
        int pos =0;
        int des =0;

      for(int i =0;i<n-1;i++) {
          des = Math.max(des, arr[i] + 1);
          if (pos == i) {
              pos = des;
              jump++;
          }
      }
        System.out.println(jump);

    }
    }