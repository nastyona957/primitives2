//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // Начальный счет клиента
        int depositAmount = 1100; // Сумма пополнения
        int bonusThreshold = 1000; // Порог пополнения для начисления бонуса
        int bonusPer100 = 1; // Бонус за каждые 100 рублей пополнения
        int bonus = 0;

        // Проверяем, превысила ли сумма пополнения порог
        if(depositAmount > bonusThreshold) {
            bonus = (depositAmount / 100) * bonusPer100;
        }
        // Рассчитываем итоговый счет
        int finalBalance = initialBalance + depositAmount + bonus;

        System.out.println("Сумма пополнения: " + depositAmount + " руб.");
        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговый счет: " + finalBalance + " руб.");
    }
}