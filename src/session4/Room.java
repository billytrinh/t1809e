package session4;

import session3.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    public String tenPhong;
    public int vitri;
    public ArrayList<User> dsUser;

    public Room() {
    }

    public Room(String tenPhong, int vitri) {
        this.tenPhong = tenPhong;
        this.vitri = vitri;
        this.dsUser = new ArrayList<>();
    }

    public void themNguoi(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name:");
        String name = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap password:");
        String password = scanner.nextLine();

        ArrayList<String> stringList = new ArrayList<>();
        for (int i=0;i<3;i++){
            System.out.println("nhap URL image:");
            stringList.add(scanner.nextLine());
        }

        User user = new User(id,name,email,password);
        user.gallery = stringList;

        dsUser.add(user);
    }

    public void xoaNguoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id muon xoa khoi danh sach:");
        int id = scanner.nextInt();
        for (int i=0;i<dsUser.size();i++){
            if(dsUser.get(i).id == id){
                dsUser.remove(i);
            }
        }
        // Neu muon xoa theo ten
//        String name = scanner.nextLine();
//        for (int i=0;i<dsUser.size();i++){
//            if(dsUser.get(i).name.equals(name)){
//                dsUser.remove(i);
//            }
//        }
    }

    public void hienThongTin(){
        System.out.println("Ten phong: "+tenPhong);
        System.out.println("Vi tri: "+vitri);

        System.out.println("Danh sach nguoi dung: ");

        for (User u : dsUser){
            System.out.println("Name: "+u.name);
            System.out.println("email: "+u.email);
            System.out.println("password: "+u.password);

            System.out.println("---------------");
        }
    }
}
