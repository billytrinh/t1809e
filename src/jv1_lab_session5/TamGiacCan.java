package jv1_lab_session5;

public class TamGiacCan extends  TamGiac{
    public double canh_bang_nhau;
    public double canh_con_lai;

    public boolean kiemTra(){
        if(super.kiemTra()){
            if(c1 == c2 || c1 == c3 || c2 == c3){
                if(c1 == c2){
                    canh_bang_nhau = c1;
                    canh_con_lai = c3;
                }else if(c1 == c3){
                    canh_bang_nhau = c1;
                    canh_con_lai = c2;
                }else if(c2 == c3){
                    canh_bang_nhau = c2;
                    canh_con_lai = c1;
                }
                return true;
            }
        }
        return false;
    }


}
