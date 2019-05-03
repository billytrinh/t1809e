package session5;

public class Main {
    public static void main(String args[]){
        Human h = new Human("aaa",17);
        h.eat();
        Asian as = new Asian("bbb",18,"afa");
        as.name = "Le van Nam";
        as.eat();

        as.run(50);


        as.eat();

        Vietnam vn = new Vietnam("nam",22,"aaf");
        vn.language = "vietnamese";
        vn.eat();
    }
}
