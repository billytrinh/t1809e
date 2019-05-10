package session8;

import jv1_lab_session6.PhoneBook;

import java.time.*;

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
    }
}
