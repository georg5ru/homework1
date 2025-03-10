public class task1 {
    public static void main(String[] args) {
        //task1
        int summa = 0;
        int counter = 0;
        while (summa < 2459000) {
            summa += 15000;
            counter += 1;
        }
        System.out.println("Месяц " + counter + ", сумма накоплений равна " + summa + " рублей");
        //task2
        counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter += 1;
        }
        System.out.println();
        for (int i = 1; i <= 10; i += 1) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        //task3
        int people = 12000000;
        int born = 17 * (people / 1000);
        int die = 8 * (people / 1000);
        int difference = born - die;
        for (int i = 1; i <= 10; i += 1) {
            people += difference;
            System.out.println("Год " + i + ", численность населения составляет " + people);
        }
        //task4
        int sum = 15000;
        int month = 1;
        while (sum < 12000000) {
            sum *= 1.07;
            System.out.println("Месяц: " + month + ", сумма: " + sum);
            month += 1;
        }
        //task5
        sum = 15000;
        month = 0;
        while (sum < 12000000) {
            for (int i = 1; i <= 6; i += 1) {
                sum *= 1.07;
                month += 1;
            }
            System.out.println("Месяц: " + month + ", сумма: " + sum);
        }
        //task6
        sum = 15000;
        for (int i = 6; i <= 108; i += 6) {
            counter = 1;
            while (counter <= 6) {
                sum *= 1.07;
                counter += 1;
            }
            System.out.println("Месяц " + i + ", сумма " + sum);
        }
        //task7
        int friday = 5;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        } while (friday <= 31);
        //task8
        int age = 0;
        while (age <= 2025 - 200) {
            age += 79;
        }
        do {
            System.out.println(age);
            age += 79;
        } while (age <= 2025 + 100);
    }
}
