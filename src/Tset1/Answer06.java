package Tset1;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer06 {
    public static void main(String[] args) {
        int peach = 1;
        for (int i = 0; i < 8; i++) {
            peach = (peach + 1) * 2;
            System.out.println("第"+(10 - (i + 1))+"天的桃子数为："+peach);
        }
    }
}
