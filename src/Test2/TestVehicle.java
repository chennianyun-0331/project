package Test2;

/**
 * @Author: cny
 * @Date: 2020/4/15 13:56
 */
class Vehicle{
    private int speed,size;

    public Vehicle(){

    }

    public Vehicle(int speed,int size){
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move(){
        System.out.println("移动");
    }

    public int speedUp(){
        int nowSpeed = speed+10;
        System.out.println("加速，当前速度为："+nowSpeed);
        return nowSpeed;
    }

    public int speedDown(){
        int nowSpeed = speed-10;
        System.out.println("减速，当前速度为："+nowSpeed);
        return nowSpeed;
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(200,400);
        System.out.println("速度为："+v.getSpeed()+"体积为："+v.getSize());
        v.speedUp();
        v.speedDown();
    }
}
