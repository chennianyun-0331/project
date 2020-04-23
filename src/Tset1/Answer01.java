package Tset1;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1){
            System.out.println("1.矩形 2.三角形 3.圆\n请选择图形：");
            Scanner input = new Scanner(System.in);
            int shape = input.nextInt();
            if(1 == shape){
                System.out.println("请输入矩形的宽：");
                float wide = input.nextFloat();
                System.out.println("请输入矩形的长：");
                float length = input.nextFloat();
                System.out.println("该矩形的面积为："+(wide*length));
            }else if(2 == shape){
                System.out.println("请输入三角形的底长：");
                float bottom = input.nextFloat();
                System.out.println("请输入三角形的高：");
                float height = input.nextFloat();
                System.out.println("该三角形的面积为："+(bottom*height)/2);
            }else{
                System.out.println("请输入圆的半径：");
                float radius = input.nextFloat();
                System.out.println("该圆的面积为："+radius*radius* Math.PI);
            }
            System.out.println("是否要继续？ 0继续  1退出");
            i = input.nextInt();
        }
    }
}
