package commomClass;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: cny
 * @Date: 2020/4/17 14:09
 */
public class Ex01 {
    public static void main(String[] args) {
        //01
        /*Double num = new Double(12.0);
        System.out.println(num.toString());

        Integer in = new Integer(12);
        System.out.println(in.toString());

        String str = new String("122");
        System.out.println(str);

        StringBuffer sbf = new StringBuffer("hello");
        System.out.println(sbf.toString());*/

        //02
        /*String str = new String("hello");
        String str1 = "hello";
        //'=='比较的是两个数据的地址，通过new出来的对象是在堆内存中，
        // 而str1是存于常量池中，所以结果是false
        System.out.println(str == str1);
        //此时的equals()经过包装类的重写，是比较两个数据的值，所以结果为true
        System.out.println(str.equals(str1));*/
        //equals复写
        /*Person p1 = new Person("linda", 18);
        Person p2 = new Person("linda", 19);
        System.out.println(p1.equals(p2));*/

        //03
        /*//绝对值
        System.out.println(Math.abs(-2));
        //最大值
        System.out.println(Math.max(1, 2));
        //最小值
        System.out.println(Math.min(1,2));
        System.out.println((int) (Math.random()*200));*/

        //04
        /*String str = "Hello World";
        System.out.println("字符串长度："+str.length());
        System.out.println("o第一次出现的索引："+str.indexOf("o"));
        System.out.println("o最后出现的索引："+str.lastIndexOf("o"));
        String str1 = str.replace("l","m");
        System.out.println(str1);

        String[] str2 = str.split(" ");
        String a = str2[0];
        System.out.println(a);
        String b = str2[1];
        System.out.println(b);
        System.out.println(a.equals(b));*/

        //05
        int x = 1;
        int y = 10;
        while (y-- > 0) {
            x++;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
class test{
    static void doit(Integer i,Integer j){
       Integer temp = j;
       i=j;
       j=temp;
    }
}

//02equals重写
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
