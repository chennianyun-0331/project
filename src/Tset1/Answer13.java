package Tset1;

import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer13 {
    public static void main(String[] args) {
        int m = 0;
        while (m < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入1-9之间的一个数：");
            int n = input.nextInt();
            int a = n;
            int result = 0;
            int min;
            for (int i = 1; i <= 5 ; i++) {
                result += n;
                n = n * 10 + a;
            }
            System.out.println(result);
            System.out.println("是否继续？ 0继续 1退出");
            m = input.nextInt();
        }
    }
}
