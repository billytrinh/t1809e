package session5;

public class Human {
    public String name;
    public int age;

    public Human(){

    }

    public Human(String name,int age){
        this.name = name+"hello";
        this.age = age;
    }

    public void eat(){
        System.out.println("eating..");
    }
}
