package Test3.Answer05;

/**
 * @Author: cny
 * @Date: 2020/4/15 16:33
 */
abstract class Role{
    private String name;

    private int age;

    private String sex;

    public Role(){
        System.out.println("role无参构造方法");
    }

    public Role(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void play();

    public void say(){
        System.out.println("role我在说话");
    }

    final public void sing(){
        System.out.println("role我在唱歌");
    }

}

class Employee extends Role{
    //只能初始化一次
    public final int id;

    static String company;

    private int salary;

    public Employee(String name, int age, String sex, int salary, int id) {
        super(name, age, sex);
        this.id = id;
        this.salary = salary;
        System.out.println("Employee的有参构造方法");
    }

    public Employee(int id){
        super();
        this.id = id;
        System.out.println("Employee的调用父类的无参构造方法");
    }

    public int getId() {
        return id;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void play(){
        System.out.println("employee我在玩");
        super.say();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                "id=" + id +
                ", salary=" + salary +
                ", company=" + company +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Employee.company = "baidu";
        System.out.println(Employee.getCompany());
        Employee e2 = new Employee(1);
        Employee e1 = new Employee("张三",25,"男",5000,1);
        System.out.println(e1);
        System.out.println(e2);
        e1.play();
        e1.sing();
    }
}
