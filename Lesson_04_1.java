import java.util.Scanner;

public class main {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int numberOne = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int numberTwo = scanner.nextInt();

    System.out.print("Укажите операцию (+, -, *, /: ");
    String operation = scanner.next();

    int result= 999;

    switch (operation) {
    case "+":
    result = numberOne + numberTwo;
    break;
    case "-":
    result = numberOne - numberTwo;
    break;
    case "*":
    result = numberOne * numberTwo;
    break;
    case "/":
    if (numberTwo != 0) {
    result = numberOne / numberTwo;
    break;
    } else {
    System.err.println("Деление на 0");
    break;
    }
    default:
    System.err.println("Недопустимая операция");
    break;

    }
    if(result != 999) {
    System.out.println("Результат: " + result);
    }
  
    //Современная аннотация
    switch (operation) {
    case "/" -> {
    if (numberTwo == 0) {
    System.err.println("Деление на 0");
    }
    else result = numberOne/numberTwo;

    }
    default -> System.err.println("Ошибка");
    }
    System.out.println("Результат: " + result);
}
}
