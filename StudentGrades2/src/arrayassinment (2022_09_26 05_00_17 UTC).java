import java.util.*;
public class arrayassinment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i=0;i<row;i++){
            for(int j=0; j<row;j++){
                int t= i*6;
                int k= j*4;
                System.out.print(t+k +" ");
            }
            System.out.println();
        }

    }
}

/*
output
0 4 8 12 16 20 24 28
6 10 14 18 22 26 30 34
12 16 20 24 28 32 36 40
18 22 26 30 34 38 42 46
24 28 32 36 40 44 48 52
30 34 38 42 46 50 54 58
36 40 44 48 52 56 60 64
42 46 50 54 58 62 66 70 */
