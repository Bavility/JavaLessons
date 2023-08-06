import java.time.LocalDate;

public class Main {
public static void main(String[] args) {

    LocalDate currentDate = LocalDate.now();

    int month = currentDate.getMonthValue();
    int year = currentDate.getYear();

    LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

    int daysInMonth = firstDayOfMonth.lengthOfMonth();
    int startDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

    System.out.println(currentDate.getMonth() + " " + year);

    System.out.println("Пн Вт Ср Чт Пт Сб Вс");

    for (int i = 1; i < startDayOfWeek; i++) {
    System.out.print("   ");
    }

    for (int i = 1; i <= daysInMonth; i++) {

    if (i < 10) {
    System.out.print(" ");
    }

    System.out.print(i + " ");

    if (startDayOfWeek % 7 == 0) {
    System.out.println();
    }

    startDayOfWeek++;
}
}
}