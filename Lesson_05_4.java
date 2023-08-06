import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int num1 = scanner.nextInt();

    System.out.print("Введите второе число: ");
    int num2 = scanner.nextInt();

    System.out.print("Введите третье число: ");
    int num3 = scanner.nextInt();

    boolean vozrst = (num1 < num2) && (num2 < num3);
    boolean ubivam = (num1 > num2) && (num2 > num3);

    boolean result = vozrst || ubivam;
    System.out.println("Результат: " + result);
}
}