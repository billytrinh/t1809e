package jv2_session3;

public class RunThread implements Runnable {

    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("index = "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception E){}
        }
    }
}
