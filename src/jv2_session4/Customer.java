package jv2_session4;

public class Customer {
    public int money = 20000;

    public synchronized void rutTien(int m){
        if(money < m){
            System.out.println("Khong the rut tien");
            try {
                wait();
            }catch (Exception e){}
        }
        money -=m;
        System.out.println("Rut tien thanh cong ");
    }

    public synchronized void napTien(int m){
        money+= m;
        System.out.println("Nap tien thanh cong");
        notify();
    }
}
