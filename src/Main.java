public class Main {
    public static void main(String[] args) {
        //task1
        int integer = 350;
        byte bit = 5;
        short mal = 31000;
        long dlin = 999999999999999999L;
        float zap = 5.2f;
        double longZap = 555555555555555.2d;
        System.out.println("Значение переменной integer с типом int равно " + integer);
        System.out.println("Значение переменной bit с типом byte равно " + bit);
        System.out.println("Значение переменной mal с типом short равно " + mal);
        System.out.println("Значение переменной dlin с типом long равно " + dlin);
        System.out.println("Значение переменной zap с типом float равно " + zap);
        System.out.println("Значение переменной longZap с типом double равно " + longZap);
        //task2
        float twenty = 27.2f;
        long nine = 987678965549L;
        double two = 2.786f;
        int five = 569;
        int minus = -159;
        short pepe = 27897;
        byte six = 67;
        //task3
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int lists = 480;
        int students = ludmila + anna + ekaterina;
        int perStudent = lists / students;
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");
        //task4
        byte perMinute = 16 / 2;
        int perTwenty = perMinute * 20;
        int perDay = perMinute * 60 * 24;
        int perThreeDay = perDay * 3;
        int perMonth = perDay * 30;
        System.out.println("За минуту машина произвела " + perMinute + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + perTwenty + " штук бутылок");
        System.out.println("За день машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + perThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");
        //task5
        byte allPaint = 120;
        byte white = (byte) ((allPaint / 6) * 2);
        byte brown = (byte) ((allPaint / 6) * 4);
        System.out.println("В школе, где " + (allPaint / 60) + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
        //task6
        int banana = 5 * 80;
        int milk = 2 * 105;
        int icecream = 2 * 100;
        int eggs = 4 * 70;
        System.out.println(banana + milk + icecream + eggs);
        System.out.println((banana + milk + icecream + eggs) / 1000);
        //task7
        int days250 = 7000 / 250;
        int days500 = 7000 / 500;
        System.out.println(days250);
        System.out.println(days500);
        System.out.println((days250 + days500) / 2);
        //task8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int plusMasha = 67760 / 10;
        int plusDenis = 83690 / 10;
        int plusKris = 76230 / 10;
        System.out.println("Маша теперь получает " + masha + plusMasha + " рублей. Годовой доход вырос на " + plusMasha + " рублей");
        System.out.println("Маша теперь получает " + kris + plusKris + " рублей. Годовой доход вырос на " + plusKris + " рублей");
        System.out.println("Маша теперь получает " + denis + plusDenis + " рублей. Годовой доход вырос на " + plusDenis + " рублей");
    }
}
