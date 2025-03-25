import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        //task1
        int[] moneySpend = {42, 52, 1488, 1000, 7};
        int summa = 0;
        for (int i = 0; i <= 4; i++) {
            summa += moneySpend[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
        //task2
        int maximum = 0;
        int minimum = 999999999;
        for (int i = 0; i <= 4; i++) {
            if (moneySpend[i] > maximum) {
                maximum = moneySpend[i];
            }
            if (moneySpend[i] < minimum) {
                minimum = moneySpend[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minimum + " рублей. Максимальная сумма трат за неделю составила " + maximum + " рублей");
        //task3
        System.out.println("Средняя сумма трат за месяц составила " + (summa / 5) + " рублей");
    }
}
