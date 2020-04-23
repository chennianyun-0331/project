package Test4;


import java.util.Arrays;

/**
 * @Author: cny
 * @Date: 2020/4/16 11:49
 */
public class Ex02 {
    public static void main(String[] args) {
        int[] oldArr = {3,7,16,0,5,0,0,6,7,0,5};
        int[] newArr = new int[oldArr.length];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if(oldArr[i] != 0){
                newArr[j] = oldArr[i];
                j++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] != 0){
                System.out.print(newArr[i]+" ");
            }
        }
    }
}
