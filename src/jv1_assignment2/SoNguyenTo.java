package jv1_assignment2;

public class SoNguyenTo {
    public int a;

    public int getA() {
        return a;
    }

    public SoNguyenTo(){
        System.out.println("Vua tao 1 doi tuong SNT");
        setA(1);
    }

    public SoNguyenTo(int x){
        setA(x);
    }

    public SoNguyenTo(String y){
        System.out.println("chay ham khoi tao co y");
    }

    public SoNguyenTo(int y,String x){

    }

    public SoNguyenTo(String y,int x){

    }

    public void setA(int a) {
        if(isSoNguyenTo(a)){
            this.a = a;
        }else {
            System.out.println("khong set gia tri");
        }
    }

    public  boolean isSoNguyenTo(int x){
        for (int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        for (int i= a+1;true;i++){
            if(isSoNguyenTo(i)){
                setA(i);
                return i;
            }
        }
    }

}
