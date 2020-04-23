package Tset1;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer09 {
    public static void main(String[] args) {
        int m = 0;
        while (m < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入行数");
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            System.out.println("是否还要继续？ 0继续 1退出");
            m = input.nextInt();
        }

    }
}
