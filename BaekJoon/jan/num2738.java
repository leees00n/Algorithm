package BaekJoon.jan;

import java.util.Scanner;

public class num2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        int [][] b = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[j][i] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = sc.nextInt();
            }
        }

        int [][] sol = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sol[j][i] = a[j][i] + b[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[j][i]+" ");
            }
            System.out.println();
        }
    }
}
