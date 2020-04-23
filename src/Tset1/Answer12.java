package Tset1;

import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer12 {
    public static void main(String[] args) {
        int m = 0;
        int max = 0;
        while (m < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入两个数：");
            int a = input.nextInt();
            int b = input.nextInt();
            int min;
            if(a > b){
                min = b;
            }else{
                min = a;
            }
            for (int i = min; i >= 1 ; i--) {
                if(a % i == 0 && b % i == 0){
                    max = i;
                    System.out.println(a + "和" + b + "的最大公约数是" + max);
                    break;
                }
                System.out.println();
            }
            System.out.println(a + "和" + b + "的最小公倍数是" + ((a / max)*(b / max) * max));
            m = input.nextInt();
            System.out.println("是否继续？ 0继续 1退出");
            m = input.nextInt();
        }
    }
}
