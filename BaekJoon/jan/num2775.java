package BaekJoon.jan;


import java.util.Scanner;

public class num2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] apt = new int[15][15];
        int k = 1;

        //아파트 짓기
        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1; // i층 1호
            apt[0][i] = i; // 0층 i호
            }

        for (int i = 1; i < 15; i++) { //1층부터 14층까지
            for (int j = 2; j <15 ; j++) { //2호부터 14호까지
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }

        //테스트 부분
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apt[t][n]);
        }
            }
}
