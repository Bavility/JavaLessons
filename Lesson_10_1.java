// Написать программу, которая определяет, содержит ли массив заданное с клавиатуры число.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    // Создаем объект Scanner для чтения ввода с клавиатуры
    Scanner scanner = new Scanner(System.in);

    int [] salary = new int[]{1200, 1400, 1300, 1000, 1500, 1800}; //объявление и инициализация

    System.out.println("Введите размер массива: ");
    int checkSalary=scanner.nextInt();
    
    boolean result = false;

    for (int i = 0; i < salary.length; i++ ){
    if (checkSalary == salary[i]){
    result = true;
    System.out.println(result);
    }
    }
    if(result==false){
    // Выводим результат
    System.out.println(result);
}
}
}

/*
Эта программа сначала запрашивает у пользователя размер массива, а затем вводит элементы массива.
Затем программа запрашивает у пользователя число, которое нужно найти, и проверяет, содержится ли это число в массиве.
Если число содержится в массиве, программа выводит сообщение "Число содержится в массиве".
В противном случае программа выводит сообщение "Число не содержится в массиве".
 */
