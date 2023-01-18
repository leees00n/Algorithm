package BaekJoon.jan;

import java.util.Scanner;

public class num2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 1;
        int snail = 0;
        int up = sc.nextInt();
        int down = sc.nextInt();
        int tree = sc.nextInt();

        while (snail <= tree) {
            snail += up;
            if (snail >= tree) {
                break;
            } else {
                snail -= down;
                day+=1;
            }

        }
        System.out.println(day);
    }
    }
