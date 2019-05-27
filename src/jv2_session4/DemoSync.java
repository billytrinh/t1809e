package jv2_session4;

public class DemoSync {

    public static void main(String args[]){
        Counter ct = new Counter();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    //synchronized (ct){
                        ct.upNumber();
                        ct.printNumber();
                   // }
                    try {
                        Thread.sleep(200);
                    }catch (Exception e){}
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        for (int i=0;i<100;i++){
            ct.upAndShow();
            try {
                Thread.sleep(200);
            }catch (Exception e){}
        }

    }
}
