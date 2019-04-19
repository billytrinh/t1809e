package session2;

import java.util.Scanner;

public class HinhChuNhat {

    private double canh_1;
    private double canh_2;

    public double getCanh_1() {
        return canh_1;
    }

    public void setCanh_1(double canh_1) {
        this.canh_1 = canh_1;
    }

    public double getCanh_2() {
        return canh_2;
    }

    public void setCanh_2(double canh_2) {
        this.canh_2 = canh_2;
    }

    public void NhapCacCanh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat:");
        setCanh_1(scanner.nextDouble());
        System.out.println("Nhap canh thu 2:");
        setCanh_2(scanner.nextDouble());
    }

    public double TinhChuVi(){
        return (getCanh_1()+getCanh_2())*2;
    }

    public double TinhDienTich(){
        return getCanh_1()*getCanh_2();
    }
}
