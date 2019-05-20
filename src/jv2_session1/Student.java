package jv2_session1;

import java.util.HashSet;
import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        HashSet<String> studentName = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (studentName.size() < 10){
            System.out.println("Nhap ten sv:");
            studentName.add(sc.nextLine());
        }

        System.out.println("DS sinh vien:");
        for (String str : studentName){
            System.out.println(str);
        }
    }
}
