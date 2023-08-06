/*
Напишите программу, которая определяет знак зодиака, исходя из даты рождения пользователя. 
Знак зодиака определяется по диапазону дат, поэтому вам потребуется использовать логические операторы для определения правильного знака зодиака.
*/

public class Main {
public static void main(String[] args) {

    int month = 10; // Замените значение на своё
    int day = 20; // Замените значение на своё

    if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
    System.out.println("Ваш знак зодиака - Водолей");
    } else if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day <= 20)) {
    System.out.println("Ваш знак зодиака - Рыбы");
    } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
    System.out.println("Ваш знак зодиака - Овен");
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
    System.out.println("Ваш знак зодиака - Телец");
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
    System.out.println("Ваш знак зодиака - Близнецы");
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
    System.out.println("Ваш знак зодиака - Рак");
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
    System.out.println("Ваш знак зодиака - Лев");
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
    System.out.println("Ваш знак зодиака - Дева");
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
    System.out.println("Ваш знак зодиака - Весы");
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
    System.out.println("Ваш знак зодиака - Скорпион");
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
    System.out.println("Ваш знак зодиака - Стрелец");
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
    System.out.println("Ваш знак зодиака - Козерог");

    // Выводим ошибку
    } else {
    System.err.println("Что-то пошло не так!");
}
}
}

/*
Программа запрашивает у пользователя его день и месяц рождения, а затем использует логические операторы для определения правильного знака зодиака. Результат выводится на экран.
*/
