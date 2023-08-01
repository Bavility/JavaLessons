import java.util.Scanner;

public class main {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

    int num = (int) (Math.random() * 5) + 1;

    System.out.println("Угадайте число от 1 до 5: ");
    int ran = scanner.nextInt();

    while (ran != num) {
    if (ran > num) {
    System.out.println("Слишком большое");
    } else {
    System.out.println("Слишком маленькое");
    }
    System.out.println("Угадайте число от 1 до 5: ");
    ran = scanner.nextInt();
    }

    System.out.println("Поздравляю, вы угадали правильное число. :)");
}
}
