package Test3.Answer03;

/**
 * @Author: cny
 * @Date: 2020/4/15 16:12
 */
interface Vehicle{
    public void start();
    public void stop();
}

class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("bike开始骑行");
    }

    @Override
    public void stop(){
        System.out.println("bike停车");
    }
}

class Bus implements Vehicle{
    @Override
    public void start(){
        System.out.println("bus发车");
    }

    @Override
    public void stop(){
        System.out.println("bus停车");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}
