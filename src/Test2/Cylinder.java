package Test2;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

/**
 * @Author: cny
 * @Date: 2020/4/15 10:47
 */
public class Cylinder extends Circle{
    private double hight;
    public Cylinder(){

    }

    public Cylinder(double r,double h){
        this.setRadius(r);
        this.hight = h;
    }

    public double getVolume(){
        double volume = this.getArea() * hight;
        return volume;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void show(double volume){
        System.out.println("该圆柱体的体积"+volume);
    }

    public static void main(String[] args) {
        System.out.println("第一种有参构造");
        Cylinder c = new Cylinder(2.0,3.0);
        c.show(c.getVolume());
        System.out.println("第二种无参构造");
        Cylinder c2 = new Cylinder();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入半径：");
        double r = input.nextDouble();
        System.out.println("请输入高：");
        double h = input.nextDouble();
        c2.setRadius(r);
        c2.getRadius();
        c2.setHight(h);
        c2.getHight();
        c2.show(c2.getVolume());
    }
}
