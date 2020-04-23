package Tset1;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer04 {
    public static void main(String[] args) {
        int i = 0;
        double price;
        while (i < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入时间：");
            String time = input.nextLine();
            System.out.println("请输入距离：");
            double distance = input.nextDouble();
            String[] a = time.split(":");
            int hour = Integer.parseInt(a[0]);
            int minute = Integer.parseInt(a[1]);
            if(hour == 1 || hour > 24 || minute > 60){
                System.out.println("输入的时间格式不正确");
            }
            if(distance <= 2){
                if(hour >= 6 && hour <= 21){
                    price = 7 + 1;
                    System.out.println("本次打车费"+ price);
                }else{
                    price = 8 + 1;
                    System.out.println("本次打车费"+ price);
                }
            }else{
                if(hour >= 6 && hour <= 21){
                    price = 7 + 1 + 1.5 * (distance - 2);
                    System.out.println("本次打车费"+ price);
                }else{
                    price = 8 + 1 + 1.5 * (distance - 2);
                    System.out.println("本次打车费"+ price);
                }
            }
            System.out.println("是否要继续？ 0继续  1退出");
            i = input.nextInt();
        }
    }
}
