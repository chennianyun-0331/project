package Test4;

import java.util.Arrays;

/**
 * @Author: cny
 * @Date: 2020/4/16 11:49
 */
public class Ex04 {
    public static void main(String[] args) {
        int[] arr = {5,2,10,8,9};
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
