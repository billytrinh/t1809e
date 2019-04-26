package session3;

import java.util.ArrayList;

public class User {

    public int id;
    public String name;
    public String email;
    public String password;
    public ArrayList<String> gallery = new ArrayList<>();

    public User() {
        ///this.gallery = new ArrayList<>();
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;

        //this.gallery = new ArrayList<>();
    }

    public static void main(String args[]){
        User userX = new User();
        userX.gallery.add("http://google.com/afafafafa.jpg");

        User[] arrayUsers = new User[10];
        for (int i=0;i<10;i++){
            arrayUsers[i] = new User(i,"Le van A","aa@gmail.com","123456");
        }

        for (User u: arrayUsers){
            System.out.println("ID: "+u.id);
            System.out.println("Name: "+u.name);
            System.out.println("Email: "+u.email);
            System.out.println("------------------");
        }

        // Dung arraylist
        ArrayList<User> userArray = new ArrayList<>();
        for (int i=0;i<50;i++){
            userArray.add(new User(i,"Le van A","aa@gmail.com","123456"));
        }
        // Xoa 1 element khoi arraylist
        userArray.remove(2); // xoa user co index = 2

        for (User u: userArray){
            System.out.println("ID: "+u.id);
            System.out.println("Name: "+u.name);
            System.out.println("Email: "+u.email);
            System.out.println("------------------");
        }
    }
}
