package jv1_lab_session5;

public class TamGiac {
    public double c1;
    public double c2;
    public double c3;

    public TamGiac(){

    }

    public TamGiac(double c1,double c2,double c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public void tinhChuVi(){
        double cv = c1+c2+c3;
        System.out.println("Chu vi: "+cv);
    }

    public void tinhDienTich(){
        double cv = (c1+c2+c3)/2;
        double S = Math.sqrt(cv*(cv-c1)*(cv-c2)*(cv-c3));
        System.out.println("Dien tich: "+S);
    }

    public boolean kiemTra(){
        if(c1+c2>c3 && c1+c3>c2 && c2+c3>c1){
            return  true;
        }else {
            return false;
        }
    }
}
