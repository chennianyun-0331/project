package Tset1;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer03 {
    public static void main(String[] args) {
        int i = 0;
        int flag;
        while (i < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入分数：");
            double grade = input.nextDouble();
            if(grade >= 90 && grade < 100){
                flag = 1;
            }else if(grade >= 80 && grade <90){
                flag = 2;
            }else if(grade >= 70 && grade < 80){
                flag = 3;
            }else if(grade >= 60 && grade < 70){
                flag = 4;
            }else{
                flag = 5;
            }
            switch (flag){
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
            }
            System.out.println("是否要继续？ 0继续  1退出");
            i = input.nextInt();
        }
    }
}
