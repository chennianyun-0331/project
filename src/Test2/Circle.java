package Test2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Author: cny
 * @Date: 2020/4/14 14:50
 */
public class Circle {
    private double Radius;

    public Circle(){

    }

    public Circle(double radius){
        this.Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getArea(){
        double area = Radius * Radius * Math.PI;
        return area;
    }

    public double getPerimeter(){
        double Perimeter = 2 * Radius * Math.PI;
        return Perimeter;
    }

    public void show(double radius,double area,double Perimeter){
        System.out.println("圆的半径："+radius);
        System.out.println("圆的面积："+area);
        System.out.println("圆的周长："+Perimeter);
    }

    public static void main(String[] args) {
        System.out.println("第一种有参构造");
        Circle c2 = new Circle(2.0);
        c2.show(c2.getRadius(),c2.getArea(),c2.getPerimeter());
        System.out.println("第二种无参构造");
        Circle c = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入半径：");
        double r = input.nextDouble();
        c.setRadius(r);
        c.getRadius();
        c.show(c.getRadius(),c.getArea(),c.getPerimeter());
    }
}
