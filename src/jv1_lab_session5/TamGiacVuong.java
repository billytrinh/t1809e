package jv1_lab_session5;

public class TamGiacVuong extends TamGiac {
    public double canh_huyen;

    public boolean kiemTra(){
        if(super.kiemTra()){
            if(c1*c1 == c2*c2+ c3*c3){
                canh_huyen = c1;
                return  true;
            }
            if (c2*c2 == c1*c1+c3*c3){
                canh_huyen = c2;
                return true;
            }
            if(c3*c3 == c1*c1+c2*c2){
                canh_huyen = c3;
                return  true;
            }
        }
        return false;
    }
}
