package jv2_session4;

public class DemoWait {
    public static void main(String args[]){
        Customer c = new Customer();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                c.rutTien(40000);
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                c.napTien(50000);
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();


    }
}
