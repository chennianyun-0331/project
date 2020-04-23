package Test3.Answer01;

/**
 * @Author: cny
 * @Date: 2020/4/15 15:43
 */
public class TestMusicTeacher {
    public static void main(String[] args) {
        Teacher musicTeacher = new MusicTeacher(1,"linda","女",28,"音乐","教授");
        musicTeacher.startWork(8);
        musicTeacher.offWork(11);
        System.out.println(musicTeacher);
        musicTeacher.teachProcedure();
    }
}
