public class Main {
public static void main(String[] args) {

        int age = 0; // Введите свой возраст:

        if (age <= 0) {
            System.out.println("Что-то пошло не так!"); // При 0 или -1 выдает ошибку

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
// Sergejs Zubakins (Bavility) 
