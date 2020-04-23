package Test2;

/**
 * @Author: cny
 * @Date: 2020/4/15 11:11
 */
public class Student {
    int sNO; //学号
    String sName; //姓名
    String sSex; //性别
    int sAge; //年龄
    double sJava; //成绩

    public Student(int sno,String name,String sex,int age,double grade){
        this.sNO = sno;
        this.sName = name;
        this.sSex = sex;
        this.sAge = age;
        this.sJava = grade;
    }

    public int getsNO() {
        return sNO;
    }

    public void setsNO(int sNO) {
        this.sNO = sNO;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public double getsJava() {
        return sJava;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "linda", "女", 12, 60.0);
        Student s2 = new Student(111, "linda", "女", 12, 60.0);
        Student s3 = new Student(111, "linda", "女", 12, 70.0);
        Student s4 = new Student(111, "linda", "女", 12, 60.0);
        Student s5 = new Student(111, "linda", "女", 12, 60.0);
        double avg = (s1.getsJava()+s2.getsJava()+s3.getsJava()+s4.getsJava()+s5.getsJava()) / 5;
        double max = Math.max(s1.getsJava(),Math.max(s2.getsJava(),Math.max(s3.getsJava(),Math.max(s4.getsJava(),s5.getsJava()))));
        System.out.println("平均值："+avg);
        System.out.println("最大值："+max);
        System.out.println("学号："+s1.getsNO()+"\t"+"姓名："+s1.getsName()+"\t"+"性别："+s1.getsSex()+"\t"+"年龄："+s1.getsAge()+"\t"+"成绩："+s1.getsJava());
        System.out.println("学号："+s2.getsNO()+"\t"+"姓名："+s2.getsName()+"\t"+"性别："+s2.getsSex()+"\t"+"年龄："+s2.getsAge()+"\t"+"成绩："+s2.getsJava());
        System.out.println("学号："+s3.getsNO()+"\t"+"姓名："+s3.getsName()+"\t"+"性别："+s3.getsSex()+"\t"+"年龄："+s3.getsAge()+"\t"+"成绩："+s3.getsJava());
        System.out.println("学号："+s4.getsNO()+"\t"+"姓名："+s4.getsName()+"\t"+"性别："+s4.getsSex()+"\t"+"年龄："+s4.getsAge()+"\t"+"成绩："+s4.getsJava());
        System.out.println("学号："+s5.getsNO()+"\t"+"姓名："+s5.getsName()+"\t"+"性别："+s5.getsSex()+"\t"+"年龄："+s5.getsAge()+"\t"+"成绩："+s5.getsJava());
    }
}
