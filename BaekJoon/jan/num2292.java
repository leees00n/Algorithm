package BaekJoon.jan;

import java.util.Scanner;

public class num2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int berjeap = 1; //범위 (최솟값 기준)
        int cnt = 1; //최소 루트

        if(number == 1){
            System.out.print(1);
        }
        else {
            while (berjeap < number){//범위가 N보다 커지기 직전까지 반복
                berjeap = berjeap + (cnt*6);
                cnt++;}
            System.out.print(cnt);
        }
    }
}
