package Test2;

/**
 * @Author: cny
 * @Date: 2020/4/15 13:12
 */
public class Addition {
    //整型
    int add(int a,int b){
        return a+b;
    }

    //长整型
    long add(long a,long b){
        return a+b;
    }

    //浮点型
    float add(float a,float b){
        return a+b;
    }

    //双精度浮点型
    double add(double a,double b){
        return a+b;
    }

    //字符串
    String add(String a,String b){
        return a+b;
        /*
        * 如果想要将字符串转换成数字相加减
        * 1.判断（正则表达式）输入的数字是否是数字（整型，浮点数等）
        * 2.根据判断出的数字类型，选择对应的封装类转换接收
        * */
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(1,2));
        System.out.println(addition.add(1234,12121));
        System.out.println(addition.add(12.1,22));
        System.out.println(addition.add(123.234,23.12));
        System.out.println(addition.add("123","123"));

    }
}
