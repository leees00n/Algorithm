package BaekJoon.jan;

import java.util.Scanner;

public class num10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char [] words = word.toCharArray();

        //-1된 알파벳 개수 26개가 든 배열 생성하기
        int alp [] = new int[26];
        for (int i = 0; i < alp.length; i++) {
            alp[i] = -1;
        }


        for (int i = 0; i < words.length; i++) {
            if(alp[words[i]-'a'] == -1){
               alp[words[i]-'a'] = i;
            }
        }


        for (int i = 0; i < alp.length; i++) {
            System.out.print(alp[i] + " ");
        }
    }
}
