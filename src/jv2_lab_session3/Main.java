package jv2_lab_session3;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        Runnable timer = new Runnable() {
            @Override
            public void run() {
                for (int i=(minutes-1);i>=0;--i){
                    for (int j = 59;j>=0;j--){
                        String show = String.format("%02d",i)+":"
                                +String.format("%02d",j);
                        System.out.println(show);
                        try {
                            Thread.sleep(100);
                        }catch (Exception e){}
                    }
                }
                System.out.println("Buuuuuum.....");
            }
        };

        new Thread(timer).start();


        sc.nextLine();
        String msg =  sc.nextLine();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true){
                    for (int i=10;i>=0;i--){
                        System.out.println(i+"s");
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){}
                    }
                    System.out.println(msg);
                }
            }
        };
        new Thread(r).start();
    }
}
