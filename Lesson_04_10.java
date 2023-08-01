import java.util.Scanner;

public class main {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

    System.out.print("Введите трехзначное число: ");
    int number = scanner.nextInt();

    int firstDigit = number / 100;
    int secondDigit = (number % 100) / 10;
    int thirdDigit = number % 10;

    int result = (int) (Math.pow(firstDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3));

    if (number == result) {
    System.out.println("Число " + number + " является самовлюбленным");
    } else {
    System.out.println("Число " + number + " не является самовлюбленным");
}
}
}
