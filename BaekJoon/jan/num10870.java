package BaekJoon.jan;


import java.util.Scanner;

public class num10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(fibonacci(N));
    }

    //피보나치 함수
    static int fibonacci(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
