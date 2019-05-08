package jv1_lab_session6;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{

    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    public static void main(String args[]) {
        PhoneNumber phoneNumber = new PhoneNumber("aa","029933");

        PhoneNumber.Telephone telephone = new PhoneNumber("aaa","343").new Telephone();
        PhoneNumber.Telephone telephone1 = phoneNumber.new Telephone();

        telephone.call();

        phoneNumber.new Telephone().call();

        //phoneNumber.new Cost().billing();
        PhoneNumber.Cost cost =  new PhoneNumber.Cost();
        cost.billing();



        try {
            int x = 1;
            x++;
            int y = 0;
            int z = 0;
//            if(y<=0) {
//                throw new ArithmeticException("khong chia tiep duoc");
//            }
            z = x / y;
            System.out.println("Z = " + z);
        }catch (ArithmeticException e) {
            System.out.println("day la loi tinh toan" );
//        }catch (ClassNotFoundException e){
//            System.out.println("day la loi ko tim thay class");
//        }catch (SQLException e){

        }catch (Exception e){
            System.out.println("Errors: ");
        }finally {

            System.out.println("finally block ..");
        }

        IPhone iPhone = new IPhone() {
            @Override
            public void calling() {
                System.out.println("Calling..");
            }
            public void ring(){

            }
        };
        iPhone.calling();
        iPhone.ring();
    }

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
        for (PhoneNumber phoneNumber:PhoneList){
            if(phoneNumber.getName().equals(name)){
                phoneNumber.setPhone(newphone);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber phoneNumber:PhoneList){
            if(phoneNumber.getName().equals(name)){
                System.out.println(phoneNumber.getName()+": "+phoneNumber.getPhone());
            }
        }
    }

    @Override
    public void sort() {
        // Collections.sort ..
//        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(PhoneList);
    }
}
