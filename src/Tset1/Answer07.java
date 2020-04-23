package Tset1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer07 {
    public static void main(String[] args) {
        int m = 0;
        while (m < 1){
            int result = 1;
            Scanner input = new Scanner(System.in);
            System.out.println("请输入正整数求n!：");
            int n = input.nextInt();
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
            System.out.println("n!="+result);
            System.out.println("是否还要继续？ 0继续 1退出");
            m = input.nextInt();
        }

    }
}
