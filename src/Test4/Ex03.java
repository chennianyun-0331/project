package Test4;


import java.util.Arrays;
import java.util.SortedMap;

/**
 * @Author: cny
 * @Date: 2020/4/16 11:49
 */
public class Ex03 {
    public static void main(String[] args) {
        float count = 0;
        float[] arr = {10,8,9,7,8,9,8,10,8,9};
        Arrays.sort(arr);
        arr[0] = arr[arr.length-1] = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        float avg = count / (arr.length-2);
        System.out.println(avg);
    }
}
