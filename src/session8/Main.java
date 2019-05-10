package session8;

import jv1_lab_session6.PhoneBook;

import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        PhoneBook p = new PhoneBook();

        LocalDate lD = LocalDate.now();

        System.out.println("today: "+lD);
        System.out.println("next day: "+lD.plusDays(1));
        System.out.println("next Month: "+lD.plusMonths(1));
        System.out.println("next Week: "+lD.plusWeeks(1));

        LocalDate lD2 = LocalDate.of(1997,2,28);
        System.out.println("today: "+lD2);
        System.out.println("next: "+lD2.plusDays(1));

        String birthday = "1999-02-28";
        LocalDate lD3 = LocalDate.parse(birthday);
        System.out.println("today: "+lD3);

        System.out.println(lD3.getDayOfYear());
        System.out.println(lD3.getDayOfWeek());
        System.out.println(lD3.getMonth());
        System.out.println(lD3.getMonthValue());

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("Now: "+ldt);
        System.out.println("Next: "+ldt.plusHours(2));

        LocalDateTime x = ldt.plusMinutes(20);

        LocalDateTime xy = LocalDateTime.of(1999,2,26,7,8,23,50);

        LocalDateTime timenow = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(timenow,ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("FROM:");
//        int from = scanner.nextInt();
//        System.out.println("TO:");
//        int to = scanner.nextInt();

        //LocalDate nt = LocalDate.parse("1900-02-28");
        LocalDate nt = LocalDate.of(1900,2,28);
        for (int i=0;i<=(100);i++){
            LocalDate year_I = nt.plusYears(i);
            LocalDate next_Year_I =  year_I.plusDays(1);
            if(next_Year_I.getDayOfMonth() == 29){
                System.out.println(next_Year_I.getYear()+" la nam nhuan");
            }
        }

        DemoInterface demo = new DemoInterface() {
            @Override
            public void demo(int a,int b) {

            }
        };

        DemoInterface demo2 = (int a,int b)->{
            System.out.println("demo... = "+ (a+b));
        };
        demo2.demo(1,2);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("abc");
        arr.add("bac");
        arr.add("aaaccccbaa");

        arr.stream().filter(s->s.startsWith("a"))
                    .sorted()
                    .map(str -> {
                        return str.toUpperCase();
                    })
                    .forEach(s -> {
                        System.out.println(s);
                    });
        for (String str: arr){
            System.out.println(str);
        }

        Human human = new Human();
        human.run();
        human.eat();

        human.run().eat();
    }
}
