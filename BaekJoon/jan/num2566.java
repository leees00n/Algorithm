package BaekJoon.jan;

import java.util.Scanner;

public class num2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int row = 0;
        int col = 0;


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] >max){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        if (max != 0) {
            System.out.println(max);
            System.out.print(row + " " + col);
        }else{
        System.out.println(0);
        System.out.print(1 + " " + 1);
    }
}

}
