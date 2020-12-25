package com.px.SynCollection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

//集合同步锁
public class SynCollection1 {
    /**
     * ArrayList，LinkedList，HashSet都不是线程安全的
     * 线程安全的list集合有Vector
     * HashMap也不是线程安全，线程安全的是HashTable
     * Collections（集合工具类）提供了相应的静态方法
     * 可以将现有的集合或Map转换为线程安全的
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        //将list转换为线程安全的
        List<String> list1 = Collections.synchronizedList(list);
        System.out.println(list1);
        //通过HashSet将线程不安全的list转换为线程安全的
        Set<String> hashSet = new HashSet<>(list);
        Set<String> set = Collections.synchronizedSet(hashSet);
        System.out.println(set);
        Map<String, Object> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",97);
        map.put("英语",95);
        Map<String, Object> map1 = Collections.synchronizedMap(map);
        System.out.println(map1);
        //ConcurrentHashMap碾压HashMap
        Map<String,Object> cmap = new ConcurrentHashMap<>();
        cmap.put("语文1",99);
        cmap.put("数学1",97);
        cmap.put("英语1",95);
        System.out.println(cmap);
        //CopyOnWrite即写时复制容器
        //CopyOnWriteArraySet碾压synchronizedSet
        //CopyOnWriteArrayList碾压synchronizedList
    }
}
