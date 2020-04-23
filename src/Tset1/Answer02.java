package Tset1;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 20:29
 */
public class Answer02 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入算式（逐个输入）：");
            double n = input.nextDouble();
            String enter = input.nextLine();
            String flag = input.nextLine();
            double m = input.nextDouble();
            switch (flag){
                case "+":
                    System.out.println("result="+(n+m));
                    break;
                case "-":
                    System.out.println("result="+(n-m));
                    break;
                case "*":
                    System.out.println("result="+(n*m));
                    break;
                case "/":
                    if(m == 0){
                        System.out.println("除数不能为零");
                    }
                    System.out.println("result="+(n/m));
                    break;
                default:
                    System.out.println("输入有误");
            }
            System.out.println("是否要继续？ 0继续  1退出");
            i = input.nextInt();
        }
    }
}
