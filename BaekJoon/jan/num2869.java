package BaekJoon.jan;

import java.util.Scanner;

public class num2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day =0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        day = (V-A) / (A-B);

        if ((V-A) % (A-B) != 0){
            day = ((V-A) / (A-B))+1;
        }
        System.out.println(day);
    }
}