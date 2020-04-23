package Tset1;

import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer08 {
    public static void main(String[] args) {
        int m = 0;
        while (m < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入数字");
            int n = input.nextInt();
            for (int i = 2; i <= n/2; i++) {
                if(n % i == 0){
                    System.out.println("该数不是素数");
                    n = 0;
                    break;
                }
            }
            if(n!=0 && n!=1){
                System.out.println("该数是素数");
            }else if(n == 1){
                System.out.println("该数不是素数");
            }
            System.out.println("是否还要继续？ 0继续 1退出");
            m = input.nextInt();
        }

    }
}
