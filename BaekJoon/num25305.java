package BaekJoon;

import java.util.*;

public class num25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int awards = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 0; i < students; i++) {
            arr.add(sc.nextInt()) ;
        }

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr.get(awards-1));
    }
}
