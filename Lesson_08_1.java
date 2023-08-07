// Напишите программу, которая будет считать от 10 до 1 в обратном порядке, используя цикл do-while.

public class Main {
public static void main(String[] args) {

    int count = 10;

    // Выводим результат
    do {
    System.out.print(count+",");
    count--;

    } while (count >= 1);
}
}