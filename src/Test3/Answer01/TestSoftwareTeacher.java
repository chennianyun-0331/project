package Test3.Answer01;

/**
 * @Author: cny
 * @Date: 2020/4/15 15:46
 */
public class TestSoftwareTeacher {
    public static void main(String[] args) {
        Teacher softwareTeacher = new SoftwareTeacher(2,"John","男",30,"软件工程","教授");
        softwareTeacher.startWork(8);
        softwareTeacher.offWork(11);
        System.out.println(softwareTeacher);
        softwareTeacher.teachProcedure();
    }
}
