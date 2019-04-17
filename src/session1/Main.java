package session1;

import java.util.Scanner;

public class Main {
    int x=10;
    static int y = 20;
    static final int z = 40;

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("So vua nhap: "+n);
        double n2 = scanner.nextDouble();// nhap vao 1 so thuc
        String str = scanner.nextLine();// nhap vao 1 chuoi
        for (int i=0;i<10;i++){
            System.out.println("i="+i);
        }

        Main m = new Main();
        System.out.println(m.x);
        m.x = m.x + 10;
        System.out.println(m.x);

        System.out.println("y= "+Main.y);
        Main.y +=10;
        System.out.println("y= "+Main.y);

        System.out.println("z= "+Main.z);
        //Main.z ++;

        Main.y = m.x%2==0 ? m.x : 20;

        if(m.x %2==0){
            Main.y = m.x;
        }else {
            Main.y = 20;
        }

    }

}
