//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 100; // Начальный баланс клиента
        int depositAmount = 1100; // Сумма пополнения

        int bonus;
        bonus = depositAmount / 100; // Начисление бонуса за каждые 100 рублей пополнения


        int finalBalance = balance + depositAmount + bonus;

        // Вывод результатов
        System.out.println("Сумма пополнения: " + depositAmount + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговый баланс: " + finalBalance + " рублей");

        }
    }
