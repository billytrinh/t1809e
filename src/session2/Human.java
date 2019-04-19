package session2;

import java.util.Scanner;

public class Human {

    public String name;
    public int age;
    public String country;

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = scanner.nextLine();

        System.out.println("Tuoi:");
        age = scanner.nextInt();// scanner.nextDouble()
        scanner.nextLine();
        System.out.println("Country:");
        country = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);
    }

    public void sayHello(){

    }
}
