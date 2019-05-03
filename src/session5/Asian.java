package session5;

public class Asian extends Human{
    public String language;

    public Asian(){

    }

    public Asian(String name,int age,String language){
        super(name,age);
        this.language = language;
    }
    public void run(){
        System.out.println("running 5km/h");
    }

    public void run(int x){
        System.out.println("running "+x+"km/h");
    }

    public void run(String x){

    }


    public void eat(){
        super.eat();
        System.out.println("an com...");
    }


}
