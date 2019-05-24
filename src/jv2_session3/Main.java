package jv2_session3;

public class Main {
    public static void main(String args[]){
        // Dung voi cach 1
//        SubThread t = new SubThread();
//        t.setName("luong thu nhat");
//        t.start();
//        SubThread t1 = new SubThread();
//        t1.start();
//        Thread.currentThread().setName("set lai ten cho main");

        // DUng voi cach 2
        RunThread r = new RunThread();
        Thread tr = new Thread(r);
        tr.start();
        int XYZ = 100;
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i< XYZ ;i++){
                    System.out.println(Thread.currentThread().getName()+" i = "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception E){}

                }
            }
        };
        new Thread(r2).start();


    }
}
