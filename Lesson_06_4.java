// Написать программу, которая принимает на вход число n и выводит пирамиду из звездочек высотой n.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите высоту елочки: ");
    int numberHeight = scanner.nextInt();

    //TODO Проверить циклы
    String sim="";
    for (int jk=0;jk<=numberHeight-1;jk++) {
        String s = " ";
        for (int i = 1; i < numberHeight - jk/2; i++) {
            s += " ";
        }

        sim+= "*";
        String sim1 = s.concat(sim);
        //String substr=sim1.substring(0,*);
        if (jk%2==0) System.out.println(sim1);
}
}
}
