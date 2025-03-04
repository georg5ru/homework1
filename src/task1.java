public class task1 {
    public static void main(String[] args) {
        //task1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        //task2
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        //task3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //task4
        int vozr = 23;
        if (vozr >= 2 && vozr <= 6) {
            System.out.println("Если возраст человека равен " + vozr + " то ему нужно ходить в детский сад");
        }
        if (vozr >= 7 && vozr <= 17) {
            System.out.println("Если возраст человека равен " + vozr + " то ему нужно ходить в школу");
        }
        if (vozr >= 18 && vozr <= 24) {
            System.out.println("Если возраст человека равен " + vozr + " то ему нужно ходить в университет");
        }
        if (vozr > 24) {
            System.out.println("Если возраст человека равен " + vozr + " то ему нужно ходить на работу");
        }
        //task5
        int let = 23;
        if (let < 5) {
            System.out.println("Если возраст ребенка равен " + let + " то ему нельзя кататься на аттракционе");
        }
        if (let > 5 && let < 14) {
            System.out.println("Если возраст ребенка равен " + let + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (let > 14) {
            System.out.println("Если возраст ребенка равен " + let + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //task6
        int seats = 52;
        if (seats < 60) {
            System.out.println("Есть сидячие места");
        }
        if (seats >= 60 && seats < 102) {
            System.out.println("Есть стоячее место");
        } else {
            System.out.println("Вагон забит");
        }
        //task7
        int one = 6;
        int two = 1;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Число 1 больше всех");
        }
        if (two >= one && two >= three) {
            System.out.println("Число 2 больше всех");
        }
        if (three >= two && three >= one) {
            System.out.println("Число 3 больше всех");
        }
    }
}