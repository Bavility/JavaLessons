/*
 * Банковский аккаунт: Создайте программу, которая имитирует работу банковского аккаунта.
 * Пользователь может выбирать действия, такие как внесение средств,
 * снятие средств и проверка баланса. Используйте цикл do-while,
 * чтобы продолжать работу с аккаунтом до тех пор, пока пользователь не решит выйти.
 */

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        // Создаем объект Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:");
        String depositAmount = "1. Внести средства ";
        String withdrawalAmount = "2. Снять средства ";
        String сheckBalance = "3. Проверить баланс ";
        String exit = "4. Выйти";
        String operation;

        int depositA = 14;
        int status;
        System.out.println(depositAmount + withdrawalAmount + сheckBalance + exit);

        do {
        status = scanner.nextInt();
        switch (status) {
        case 1:
        operation = "Внесение средств";
        System.out.println(operation);
        System.out.println("Какую сумму желаете внести?");
        depositA = depositA + scanner.nextInt();
        System.out.printf("На Вашем счету %d Euro", depositA);
        break;
                
        case 2:
        operation = "Снятие средств";
        System.out.println(operation);
        System.out.println("Какую сумму желаете снять?");
        int withdrawalA = scanner.nextInt();
        if (withdrawalA > depositA) {
        System.out.println("У вас не хватит на это денег");
        } else {
        depositA = depositA - withdrawalA;
        }
        System.out.printf("На Вашем счету %d Euro", depositA);
        break;
                
        case 3:
        operation = "Проверка баланса";
        System.out.println(operation);
        System.out.printf("Ваш баланс %d Euro", depositA);
        break;
                
        case 4:
        operation = "Выход из системы";
        System.out.println(operation);
        break;

        // Уведомление об ошибке
        default:
        System.err.println("Неверный вариант. Попробуйте снова.");
        status = 0;
        }
        }
        while (status != 0);
}
}
