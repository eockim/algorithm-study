package time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class LocalDateSample {



    public static LocalDate currentDate(){
        return LocalDate.now();
    }

    public static void main(String ...args){

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.parse("2018-05-05"));
        System.out.println(LocalDate.parse("2018/08/06", DateTimeFormatter.ofPattern("yyyy/MM/dd")));

        System.out.println(LocalDate.of(2018, 8, 28));
        System.out.println(LocalDate.of(2018, Month.AUGUST, 28));

        System.out.println(LocalDate.ofYearDay(2018, 300));

        currentDate()
        .plus(1, ChronoUnit.DAYS);

        currentDate()
        .plusMonths(2);



        System.out.println(LocalDateSample.currentDate()
                .minus(2, ChronoUnit.MONTHS));

        System.out.println(currentDate().minusYears(3));

        LocalDate c = LocalDate.now();

        LocalDate p1 = LocalDate.of(2018, 03, 03);

        System.out.println(c.isAfter(p1));
        System.out.println(c.isBefore(p1));

        System.out.println(c.compareTo(p1));

        System.out.println(LocalDate.now().isLeapYear());

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getMonth());

        System.out.println(LocalDate.parse("2018-10-20").with(TemporalAdjusters.firstDayOfNextYear()));

        LocalTime.now();
        LocalTime.of(12,30,30);
        LocalTime.parse("11:20");

        LocalTime.now().plusHours(1);
        LocalTime.of(11,20).minusHours(1);

        System.out.println(LocalTime.of(11,20).plus(Duration.ofMillis(2000)));




    }
}
