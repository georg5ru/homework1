public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task2
        dog = 8.0;
        cat = 3.6;
        paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        //task6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        System.out.println(secondBoxer - firstBoxer);
        //task7
        firstBoxer = 78.2;
        secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        System.out.println(secondBoxer - firstBoxer);
        System.out.println(secondBoxer % firstBoxer);
        //task8
        var hoursSummary = 640;
        var hoursPerHuman = 8;
        var humanSummary = hoursSummary / hoursPerHuman;
        System.out.println("Всего работников в компании — " + humanSummary + " человек");
        humanSummary = humanSummary + 94;
        hoursPerHuman = hoursSummary / humanSummary;
        System.out.println("Если в компании работает " + humanSummary + " человек, то всего " + hoursPerHuman + " часов работы может быть поделено между сотрудниками");
    }
}
