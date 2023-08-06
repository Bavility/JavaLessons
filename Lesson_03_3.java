/*
Напишите программу, которая определяет знак зодиака, исходя из даты рождения пользователя. 
Знак зодиака определяется по диапазону дат, поэтому вам потребуется использовать логические операторы для определения правильного знака зодиака.
*/

public class Main {
public static void main(String[] args) {

    int day = 20; // Замените значение на своё
    int month = 10; // Замените значение на своё

    String zodiacSign = null;

    switch (month) {
    case 1: // Январь месяц
    if (day >= 20) {
    zodiacSign = "Водолей";
    } else {
    zodiacSign = "Козерог";
    }
    break;
                    
    case 2:
    if (day >= 19) {
    zodiacSign = "Рыбы";
    } else {
    zodiacSign = "Водолей";
    }
    break;
                    
    case 3:
    if (day >= 21) {
    zodiacSign = "Овен";
    } else {
    zodiacSign = "Рыбы";
    }
    break;
                    
    case 4:
    if (day >= 20) {
    zodiacSign = "Телец";
    } else {
    zodiacSign = "Овен";
    }
    break;
                    
    case 5:
    if (day >= 21) {
    zodiacSign = "Близнецы";
    } else {
    zodiacSign = "Телец";
    }
    break;
                    
    case 6:
    if (day >= 22) {
    zodiacSign = "Рак";
    } else {
    zodiacSign = "Близнецы";
    }
    break;
                    
    case 7:
    if (day >= 23) {
    zodiacSign = "Лев";
    } else {
    zodiacSign = "Рак";
    }
    break;
                    
    case 8:
    if (day >= 23) {
    zodiacSign = "Дева";
    } else {
    zodiacSign = "Лев";
    }
    break;
                    
    case 9:
    if (day >= 23) {
    zodiacSign = "Весы";
    } else {
    zodiacSign = "Дева";
    }
    break;
                    
    case 10:
    if (day >= 23) {
    zodiacSign = "Скорпион";
    } else {
    zodiacSign = "Весы";
    }
    break;
                    
    case 11:
    if (day >= 22) {
    zodiacSign = "Стрелец";
    } else {
    zodiacSign = "Скорпион";
    }
    break;
                    
    case 12:
    if (day >= 22) {
    zodiacSign = "Козерог";
    } else {
    zodiacSign = "Стрелец";
    }
    break;
    }
    
    // Выводим результат
    System.out.println("Ваш знак зодиака: " + zodiacSign);
}
}

/*
Программа запрашивает у пользователя его день и месяц рождения, а затем использует логические операторы для определения правильного знака зодиака. Результат выводится на экран.
*/
