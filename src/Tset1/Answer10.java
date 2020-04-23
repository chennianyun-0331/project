package Tset1;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer10 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for(int j = 0;j <= 33;j++) {
                if (5 * i + 3 * j + (100 - i - j) / 3 == 100) {
                    if ((100 - i - j) % 3 ==  0) {
                        System.out.println("公鸡：" + i + " 母鸡：" + j + " 小鸡：" + (100 - i - j));
                    }
                }
            }
        }

    }
}
