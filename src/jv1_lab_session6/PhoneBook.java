package jv1_lab_session6;

import java.sql.SQLException;
import java.util.ArrayList;

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
