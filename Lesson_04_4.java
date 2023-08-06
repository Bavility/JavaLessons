import java.util.Scanner;

public class Main {
public static void main(String[] args) {

     // Создаем объект Scanner для чтения ввода с клавиатур
    Scanner scanner = new Scanner(System.in);

    int cash;
    int change;

    String cocaCola = "Coca-Cola";
    String water = "Water";
    String chocolate = "Chocolate";

    int cocaColaPreis = 3;
    int waterPreis = 2;
    int chocolatePreis = 5;

    String inputWare;

    System.out.print("Выберите товар: Coca-Cola3€), Water(2€), Chocolate(5€)");
    inputWare = scanner.next();

    switch (inputWare){
    case "Coca-Cola" -> {
    System.out.print(" Заплатите за выбранный товар: ");
    cash =  scanner.nextInt();
    change = cash - cocaColaPreis;
    if(change > 0){
    System.out.println("Вот ваша " + cocaCola +  " и ваша сдача " + change + " евро");
    }
    else if (change < 0) {
    System.out.println("Недостаточно денег. Доплатите " + Math.abs(change) + " евро");
    }
    else {
    System.out.println("Вот ваша" + cocaCola);
    }
    }
    case "Water" -> {
    System.out.print(" Заплатите за выбранный товар: ");
    cash =  scanner.nextInt();
    change = cash - waterPreis;
    if(change > 0){
    System.out.println("Вот ваша " + water +  " и ваша сдача " + change + " евро");
    }
    else if (change < 0) {
    System.out.println("Недостаточно денег. Доплатите " + Math.abs(change) + " евро");
    }
    else {
    System.out.println("Вот ваша " + water);
    }

    }
    case "Chocolate" -> {
    System.out.print(" Заплатите за выбранный товар: ");
    cash =  scanner.nextInt();
    change = cash - chocolatePreis;
    if(change > 0){
    System.out.println("Вот ваш " + chocolate +  "и ваша сдача " + change + " евро");
    }
    else if (change < 0) {
    System.out.println("Недостаточно денег. Доплатите " + Math.abs(change) + " евро");
    }
    else {
    System.out.println("Вот ваша " + chocolate);
    }
    }
    default -> System.err.println("Товара " + inputWare + " нет в наличии");
}
}
}