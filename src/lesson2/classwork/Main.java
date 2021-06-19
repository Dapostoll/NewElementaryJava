package lesson2.classwork;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List list = new <String> ArrayList();
        System.out.println(list.isEmpty());
        list.add("element");
        list.add("element1");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("element"));
//        System.out.println(list.containsAll());
        System.out.println(list.remove("element"));
        System.out.println(list.size());
        System.out.println(list);

        Deque linkedList = new <String>LinkedList();
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.peek());
//        linkedList.add("element");
//        linkedList.add("element1");
//        System.out.println(linkedList.isEmpty());
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.contains("element"));
////        System.out.println(list.containsAll());
//        System.out.println(linkedList.remove("element"));
//        System.out.println(linkedList.size());
//        System.out.println(linkedList);

//        Set set = new HashSet(linkedList);
//        System.out.println(set);
//
//        set.add("xd");
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        Iterator iterator = set.iterator()
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        Map map = new HashMap();
//        map.put("key","asasd");
//        map.put(1,"sasad");
//
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.get(1));
//        System.out.println(map.get("key"));
//        System.out.println(map.entrySet());
//        System.out.println(map.remove("key"));
//




    }
}
