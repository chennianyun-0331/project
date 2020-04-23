package Tset1;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer11 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = (i / 100) % 10;
            int thousands = i / 1000;
            if((ones == thousands) && (tens == hundreds)){
                System.out.println(i);
            }
        }

    }
}
