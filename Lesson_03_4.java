// Напишите программу, которая принимает возраст пользователя и выводит возрастную категорию: ребенок (до 12 лет), подросток (13-18 лет), взрослый (19-59 лет), пожилой (60 лет и старше).

public class Main {
public static void main(String[] args) {

    int age = 0; // Замените значение на своё
    
    // Уведомление об ошибке
    if (age <= 0) {
    System.err.println("Что-то пошло не так!"); // При 0 или -1 выдает ошибку
        
    // Выводим результат
    } else if (age >= 1 && age <= 14) {
    System.out.println("Ребенок");    
    } else if (age >= 15 && age <= 18) {
    System.out.println("Подросток");
    } else if (age >= 19 && age <= 59) {
    System.out.println("Взрослый");
    } else {
    System.out.println("Пожилой");
}
}
}

/*
Программа запрашивает у пользователя возраст и затем определяет возрастную категорию с помощью условных операторов (if-else). Результат выводится в консоль.
*/
