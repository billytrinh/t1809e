package jv2_session3;

public class Main {
    public static void main(String args[]){
        SubThread t = new SubThread();
        t.setName("luong thu nhat");
        t.start();
        SubThread t1 = new SubThread();
        t1.start();
        Thread.currentThread().setName("set lai ten cho main");
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" i = "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception E){}

        }
    }
}
