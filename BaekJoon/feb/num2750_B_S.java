package BaekJoon.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2750_B_S {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //선택 정렬 selection sort
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
            for(int val : arr){
                sb.append(val).append('\n');
            }
            System.out.println(sb);
        }
    }

