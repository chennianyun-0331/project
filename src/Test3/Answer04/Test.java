package Test3.Answer04;

/**
 * @Author: cny
 * @Date: 2020/4/15 16:19
 */
abstract class Door{
    public void open(){
        System.out.println("打开");
    }

    public void close(){
        System.out.println("关闭");
    }
}

interface FireSafe{
    public abstract void fireProof();
}

interface BulletSafe{
    public abstract void bulletProof();
}

class FireProofDoor extends Door implements FireSafe{
    @Override
    public void fireProof(){
        System.out.println("防火");
    }
}

class BulletProofDoor extends Door implements BulletSafe{
    @Override
    public void bulletProof(){
        System.out.println("防弹");
    }
}

public class Test {
    public static void main(String[] args) {
        FireProofDoor fire = new FireProofDoor();
        fire.fireProof();
        fire.open();
        fire.close();
        BulletProofDoor bullet = new BulletProofDoor();
        bullet.bulletProof();
        bullet.open();
        bullet.close();
    }
}
