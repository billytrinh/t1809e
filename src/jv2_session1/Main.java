package jv2_session1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);

        HashSet<String> strs = new HashSet<>();

        strs.add("hello");
        strs.add("world");
        strs.add("hello");

//        for (String s: strs){
//            System.out.println(s);
//        }

        PriorityQueue<String> strQueue = new PriorityQueue<>();
        strQueue.add("bca");
        strQueue.add("cba");
        strQueue.add("abc");

        for (String s : strQueue){
            System.out.println(s);
        }

        PriorityQueue<Human> hQueue = new PriorityQueue<>();
        hQueue.add(new Human(4,"Nam"));
        hQueue.add(new Human(2,"Vinh"));
        hQueue.add(new Human(18,"Dung"));

        for(Human h: hQueue){
            System.out.println(h.name);
        }

        HashMap<String,String> hs = new HashMap<>();
        hs.put("a1","Le van Nam");
        hs.put("a2","Le van Dung");

        System.out.println(hs.get("a1"));

        hs.forEach((keyStr,valStr) -> {
            System.out.println("Phan tu co key: "+keyStr
                    +" co gia tri: "+ valStr);
        });
    }
}
