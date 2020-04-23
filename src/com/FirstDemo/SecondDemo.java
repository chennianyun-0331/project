package com.FirstDemo;

import com.sun.org.apache.xerces.internal.xs.StringList;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * day2
 *
 * @Author: cny
 * @Date: 2020/4/14 09:19
 */
public class SecondDemo {
    public static void main(String[] args) {
        /*BigDecimal a = new BigDecimal(Double.toString(2.4));
        BigDecimal b = new BigDecimal(Double.toString(0.4));
        BigDecimal c = a.divide(b);
        System.out.println(c);
        double e = 2.4;
        double f = 0.4;
        System.out.println(e/f);
        Integer in1 = 129;
        Integer in2 = 129;
        System.out.println("-------------------");*/
        //比较内存地址
        /*System.out.println(in1 == in2);*/
        //Integer重写了equals方法，比较值
       /* System.out.println(in1.equals(in2));
        Integer in3 = new Integer(129);
        System.out.println("-------------------");*/
        //new一个新对象会在堆内存中开辟一个新空间，此时内存地址不同了
        /*System.out.println(in1 == in3);
        System.out.println(in1.equals(in3));*/

        //格式化时间
        /*Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowDate = sdf.format(now);
        System.out.println(nowDate);*/

        //集合
        //加上<数据类型（如String）>，该list只能存储相应类型的元素
        /*ArrayList<String> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        arrayList.add("Linda");
        arrayList.add("John");
        arrayList2.add("Linda");
        arrayList2.add("John");
        System.out.println(arrayList);*/
        //删除
        /*arrayList.remove(0);
        System.out.println(arrayList);*/
        //是否包含某个数据
        /*System.out.println(arrayList.contains("Linda"));*/
        //某个集合是否包含一个集合的全部数据
        /*System.out.println(arrayList2.containsAll(arrayList));*/
        //判断是否为空
        /*System.out.println(arrayList.isEmpty());
        for (int i = 0; i < arrayList.size(); i++) {
            //集合是通过get方式索引
            System.out.println(arrayList.get(i));
        }*/

        //迭代器
        /*Iterator iterator = arrayList.iterator();
        //判断是否有下一个元素
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        //Set 数据不能重复
        /*Set<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        System.out.println(hashSet);
        //TreeSet 按照字典自动排序
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(hashSet);
        System.out.println(treeSet);*/

        //hashMap
       /* HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"linda");
        map.put(2,"linda");
        //用list承载map
        List<Map<Integer, String>> list2 = new ArrayList<>();
        list2.add(map);
        System.out.println(list2);
        //判断是否存在
        System.out.println(map.containsKey(3));
        //Map遍历
        //通过map.keySet遍历key和value(普遍使用，二次取值)
        for (Integer key : map.keySet()) {
            System.out.println("key="+ key +" value:" + map.get(key));
        }
        //利用entrySet(推荐，尤其是量大的时候)
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("key="+ entry.getKey() +" value:" + entry.getValue());
        }
        //利用Map.values()遍历所有的value，无法遍历key
        for(String v : map.values()){
            System.out.println("value:" + v);

        }*/

        //数据处理
        /*String str = "a,b,c";
        String[] arr = str.split(",");
        List<String> list = Arrays.asList(arr);
        System.out.println(list);*/

        //collections
        /*//二分法查找索引
        System.out.println(Collections.binarySearch(list, "b"));
        //拷贝
        //ArrayList<String> newList = new ArrayList<>(3);
        //Collections.copy(newList, new ArrayList<>(list));
        //System.out.println(newList);*/

        //异常
        //非受检异常(数组越界等)：可捕获可不捕获
        //受检异常：必须要捕获
        //异常处理
        //1 try
        try {
            int i = 1/0;
        }catch (ArithmeticException e){
            //可catch多个异常
            System.out.println("算术异常");
        }catch (Throwable e){
            System.out.println(11);
        }finally {
            //最终必须执行的代码段
            System.out.println("end");
        }
        //2 利用throw向上抛
        //public static void main(String[] args) throws ArithmeticException{...}
    }
}
