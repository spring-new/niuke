package niuke;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
 class Main3 {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ary.length ; i++) {
            ary[i] = scanner.nextInt();
        }

        //write your code here......

        Arrays.sort(ary);
        max = ary[5];
        min = ary[0];
        System.out.println(max + " " + min);
    }
}