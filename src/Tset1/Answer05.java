package Tset1;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer05 {
    public static void main(String[] args) {
        for (int i = 1900; i < 2051; i++) {
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                System.out.println(i);
            }
        }
    }
}
