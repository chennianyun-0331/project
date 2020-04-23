package Test3.Answer01;

/**
 * @Author: cny
 * @Date: 2020/4/15 15:33
 */
public class MusicTeacher extends Teacher {
    public MusicTeacher(int id, String name, String sex, int age, String education, String teacherTitle){
        super(id, name, sex, age,education,teacherTitle);
    }

    @Override
    public void teachProcedure(){
        System.out.println("识谱，唱歌");
    }
}
