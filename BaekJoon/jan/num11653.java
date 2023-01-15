package BaekJoon.jan;

import java.util.Scanner;

public class num11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 2; i < 10000000; i++) {
            while(number%i == 0){
                number = number/i;
                System.out.println(i);
            }
        }
    }
}
