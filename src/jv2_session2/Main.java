package jv2_session2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String args[]){
        tinh_tong(3,5);
        tinh_tong(3.14,5.55);
        MyGeneric<String,Integer> mg1= new MyGeneric<>();
        //show(1);
        show(new Human());
        show(new Asian());
        PhoneNumber<String,String> pn1 = new PhoneNumber<>("nam","09888888");
    }

    public static <E extends Human> void show(E e){
        e.showInfo();
    }

    public static void show2(ArrayList<? super Integer> a){

    }

    public static <N extends Number> void tinh_tong(N a, N b){
        System.out.println(a.doubleValue()+b.doubleValue());
    }

//    public static void tinh_tong(int a,int b){
//        System.out.println(a+b);
//    }
//
//    public static void tinh_tong(double a,double b){
//        System.out.println(a+b);
//    }
}
