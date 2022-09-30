import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if (A+B+C+D==100) {
            if (A>B) {
                if (A>C) {
                    if (A>D){
                        System.out.println(A);
                    } else {
                        System.out.println(D);
                    }
                }
            }
            else if ( B>C){
                if (B>D){
                    System.out.println(B);
                } else {
                    System.out.println(D);
                }
            }
            else if (C>D){
                System.out.println(C);
            } else {
                System.out.println(D);
            }

        }

    }
}