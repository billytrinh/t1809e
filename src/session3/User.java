package session3;

public class User {

    public int id;
    public String name;
    public String email;
    public String password;

    public User() {
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static void main(String args[]){
        User u1 = new User();

        User u2 = new User(1,"Le van A","aa@gmail.com","123456");
    }
}
