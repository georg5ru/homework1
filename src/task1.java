public class task1 {
    public static void main(String[] args) {
        //task1
        int age = 18;
        if (age < 18) {
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
        int ageOfMan = 23;
        if (ageOfMan >= 2 && ageOfMan <= 6) {
            System.out.println("Если возраст человека равен " + ageOfMan + " то ему нужно ходить в детский сад");
        }
        if (ageOfMan >= 7 && ageOfMan <= 17) {
            System.out.println("Если возраст человека равен " + ageOfMan + " то ему нужно ходить в школу");
        }
        if (ageOfMan >= 18 && ageOfMan <= 24) {
            System.out.println("Если возраст человека равен " + ageOfMan + " то ему нужно ходить в университет");
        }
        if (ageOfMan > 24) {
            System.out.println("Если возраст человека равен " + ageOfMan + " то ему нужно ходить на работу");
        }
        //task5
        int ageOfChild = 23;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " то ему нельзя кататься на аттракционе");
        }
        if (ageOfChild >= 5 && ageOfChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageOfChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " то ему можно кататься на аттракционе без сопровождения взрослого");
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