// Напишите простую игру, в которой компьютер загадывает число от 1 до 100, а пользователь пытается его угадать. Используйте цикл do-while, чтобы повторять игру, пока пользователь не угадает число.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    //Загадываем число
    int pcRandom = (int) (Math.random() * 100) + 1;

    // Приветствие
    System.out.println("Добро пожаловать в игру 'Угадай число'");
    System.out.println("Компьютер загадал число от 1 до 100: ");
    System.out.println("Попробуйте угадать!");

    do {
    int user = scanner.nextInt();
    if (user > pcRandom) {
    System.out.println("Загаданное число больше!");
    } else if (user < pcRandom) {
    System.out.println("Загаданное число меньше!");
    } else {

    // Выводим результат
    System.err.println("Поздравляю! Вы угадали число: " + pcRandom);
    System.err.println("Спасибо за игру! До новых встреч.");
    break;
    }
    } while (true);
}
}
