public class task1 {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(i);
        }
        //task2
        System.out.println("task2");
        for (int i = 10; i > 0; i -= 1) {
            System.out.println(i);
        }
        //task3
        System.out.println("task3");
        for (int i = 2; i <= 17; i += 2) {
            System.out.println(i);
        }
        //task4
        System.out.println("task4");
        for (int i = 10; i >= -10; i -= 1) {
            System.out.println(i);
        }
        //task5
        System.out.println("task5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        //task6
        System.out.println("task6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //task7
        System.out.println("task7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        //task8
        System.out.println("task8");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i += 1) {
            total += savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //task9
        System.out.println("task9");
        total = 29000;
        int percent = total / 100;
        for (int i = 1; i <= 12; i += 1) {
            total += percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //task10
        System.out.println("task10");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}
