package jv1_lab_session6;

import java.util.ArrayList;

public class PhoneBook extends Phone{

    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pN : PhoneList){
            if(pN.getName().equals(name)){
                if(pN.getPhone().equals(phone)){
                    System.out.println("So dien thoai da ton tai");
                }else {
                    //pN.setPhone(pN.getName()+":"+phone);
                    String x = pN.getPhone();
                    x+= ":"+phone;
                    pN.setPhone(x);

                    System.out.println("da them vao so cu");
                }
                return;
            }
        }
        PhoneNumber px = new PhoneNumber(name,phone);
        PhoneList.add(px);
    }

    @Override
    public void removePhone(String name) {
//        for (PhoneNumber pN : PhoneList){
//            if(pN.getName().equals(name)){
//                PhoneList.remove(pN);
//                return;
//            }
//        }
        for (int i=0;i<PhoneList.size();i++){
            if(PhoneList.get(i).getName().equals(name)){
                PhoneList.remove(i);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {
        // Collections.sort ..
        // Bubble sort
    }
}
