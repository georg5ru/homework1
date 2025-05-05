public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1: Сумма всех выплат за месяц.");

        int[] monthExpenditures = {10000, 20000, 15000, 12000, 8000};
        int sumMonth = 0;
        for (int expenditure : monthExpenditures) {
            sumMonth += expenditure;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей.");

        System.out.println();

        // Задача 2
        System.out.println("Задача 2: Минимальная и максимальная траты за неделю.");

        int[] weeklyExpenditures = {55000, 45000, 72000, 110000, 99999};
        int minExpense = weeklyExpenditures[0];
        int maxExpense = weeklyExpenditures[0];

        for (int expense : weeklyExpenditures) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        System.out.println();

        // Задача 3
        System.out.println("Задача 3: Средняя сумма трат за месяц.");

        int[] monthExpendituresForAverage = {12000, 15000, 14000, 13000, 11000};
        int sumForAverage = 0;
        for (int expense : monthExpendituresForAverage) {
            sumForAverage += expense;
        }

        double average = (double) sumForAverage / monthExpendituresForAverage.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println();

        // Задача 4
        System.out.println("Задача 4: Исправить &laquo;перевернутое&raquo; имя.");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ',
                'v', 'o', 'n', 'a', 'v', 'I' };

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int j = reverseFullName.length - 1 - i;
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }

        System.out.print("Результат разворота: ");
        for (char c : reverseFullName) {
            System.out.print(c);
        }
        System.out.println();
    }
}