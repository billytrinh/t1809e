package session6;

public abstract class Person {
    public String name;
    public int age;

    public void drive(){
        System.out.println("driving...");
    }

    public abstract void drink();
    public abstract void drink2();

}
