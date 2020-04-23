package Test3.Answer02;

/**
 * @Author: cny
 * @Date: 2020/4/15 15:58
 */
public abstract class Vehicle {
    abstract public void wheelsNum();

    public void run(){
        System.out.println("Running");
    }
}

class Car extends Vehicle{
    @Override
    public void wheelsNum(){
        System.out.println("四轮车");
    }
}

class Motorbike extends Vehicle{
    @Override
    public void wheelsNum(){
        System.out.println("双轮车");
    }
}

class Test{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorbike = new Motorbike();
        car.run();
        car.wheelsNum();
        motorbike.run();
        motorbike.wheelsNum();
    }
}
