public class Main {
public static void main(String[] args) {

    int number = 2; 

    boolean ev = number % 2 == 0;
    boolean od = number % 2 != 0;

    if (number <= 0) {
    System.err.println("Что-то пошло не так!"); // При 0 или -1 выдает ошибку
            
    } else if (ev) {
    System.out.println("Четное");
    } else if (od) {
    System.out.println("Нечетное");
}
}
}
// Sergejs Zubakins (Bavility) 
