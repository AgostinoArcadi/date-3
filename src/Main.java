import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = date.getYear();
        System.out.println("year: " + year);

        String month = date.getMonth().toString();
        System.out.println("month: " + month);

        int day = date.getDayOfMonth();
        System.out.println("day: " + day);

        String weekDay = date.getDayOfWeek().toString();
        System.out.println("week day: " + weekDay);

    }
}
