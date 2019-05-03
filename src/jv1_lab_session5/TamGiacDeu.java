package jv1_lab_session5;

public class TamGiacDeu extends TamGiacCan {

    public boolean kiemTra(){
        if(super.kiemTra()){
            if(canh_bang_nhau == canh_con_lai){
                return true;
            }
        }
        return false;
    }

}
