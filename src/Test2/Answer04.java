package Test2;

/**
 * @Author: cny
 * @Date: 2020/4/15 13:40
 */
public class Answer04 {
    public static void main(String[] args) {
        Students s = new Students("张三",18);
        System.out.println("姓名："+s.getName());
        System.out.println("年龄："+s.getAge());
    }
}
class Person{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Students extends Person{
    public Students(String name,int age){
        super(name,age);
    }
}
