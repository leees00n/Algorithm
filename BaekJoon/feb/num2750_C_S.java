package BaekJoon.feb;

import java.util.Scanner;

public class num2750_C_S {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        /*
        * range : -1000 ~ 1000
        * 0은 index[1000]을 의미
        * */
        boolean[] arr = new boolean[2001];
        for (int i = 0; i < N; i++) {
            arr[sc.nextInt() + 1000] = true;
        }

        // 정렬 과정이 따로 필요 없음
        for (int i = 0; i < 2001; i++) {
            if (arr[i]){
                System.out.println(i-1000);
            }
        }
    }
}
