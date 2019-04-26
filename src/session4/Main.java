package session4;

import session3.User;

import java.util.ArrayList;


public class Main {

    public static void main(String args[]){
        int[] arr = new int[10];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 0;

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int x: arr){
            System.out.println(x);
        }

        User[] users = new User[4];
        //User x = new User();
        users[0] = new User();
        users[1] = new User();

        users[1].name = "Ha";

        int[][] multiArr = new int[2][3];

        ArrayList arrayList = new ArrayList();

        arrayList.add(5);

        arrayList.add("hello");

        User x = new User();
        arrayList.add(x);

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("hello");
        strArray.add("world");
        strArray.add("hello everybody");

        for (int i=0;i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }

        for (String i: strArray){
            System.out.println(i);
        }

        ArrayList<User> userArray = new ArrayList<>();
        User x1 = new User();
        userArray.add(x1);

        ArrayList allArray = new ArrayList();
        allArray.add("everybody");
        allArray.add(x1);

        for (int i=0;i< allArray.size();i++){
            if(allArray.get(i) instanceof String){
                System.out.println(allArray.get(i));
            }else if(allArray.get(i) instanceof User){
                User abc = (User)allArray.get(i);
                abc.name = "hahaha";
            }
        }

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        ArrayList<Float> floatArrayList = new ArrayList<>();

    }

}
