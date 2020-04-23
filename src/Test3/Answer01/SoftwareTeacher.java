package Test3.Answer01;

/**
 * @Author: cny
 * @Date: 2020/4/15 15:40
 */
public class SoftwareTeacher extends Teacher {
    public SoftwareTeacher(int id, String name, String sex, int age, String education, String teacherTitle){
        super(id, name, sex, age,education,teacherTitle);
    }

    @Override
    public void teachProcedure(){
        System.out.println("基础，练习");
    }
}
