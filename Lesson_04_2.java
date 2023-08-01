import java.util.Scanner;

public class main {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

    String greet;
    String answer = "Я вас не понимаю";

    System.out.print("Введите слово");
    greet = scanner.next();

    switch (greet) {
    case "Привет"-> answer = "Привет";
    case "Пока"-> answer = "До встречи!";

    default -> System.err.println(Ошибка!");

    }
    System.out.println(answer);

}
}
