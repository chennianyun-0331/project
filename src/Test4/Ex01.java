package Test4;

/**
 * @Author: cny
 * @Date: 2020/4/16 11:42
 */
public class Ex01 {
    public static void main(String[] args) {
        boolean flag = false;
        int[] arr = new int[]{1,2,3,1,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    flag = true;
                    System.out.println("重复");
                    break;
                }
            }
        }
        if(flag == false){
            System.out.println("不重复");
        }
    }
}
