// Напишите программу, которая будет запрашивать у пользователя ввести пароль. Если пароль не соответствует заранее заданному, программа должна повторно запросить пароль. Используйте цикл do-while для этого.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    // Заданный Логин и Пароль
    String username = "bavility";
    String password = "qwerty";

    do {
    System.out.print("Логин: ");
    String eUsername = scanner.nextLine();
    System.out.print("Пароль: ");
    String ePassword = scanner.nextLine();
    System.out.print("Вы на правильном пути.. ");
    System.err.print("Нажмите кнопку Enter");
    String eEnter = scanner.nextLine();

    if (username.equals(eUsername) && password.equals(ePassword)) {

    // Выводим результат
    System.err.println("Поздравляем! Вы взломали базу Пентагона!!!");
    break;

    // Выводим ошибку
    } else {
    System.err.println("К сожалению вам не удалось взломать Пентагон. Не расстраивайтесь в следующий раз вам повезет!");
    }
    } while (true);
}
}
//bavility
