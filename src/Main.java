public class Main {
    public static void main(String[] args) {
        var hoursSummary = 640;
        var hoursPerHuman = 8;
        var humanSummary = hoursSummary / hoursPerHuman;
        System.out.println("Всего работников в компании — " + humanSummary + " человек");
        humanSummary = humanSummary + 94;
        hoursPerHuman = hoursSummary / humanSummary;
        System.out.println("Если в компании работает " + humanSummary + " человек, то всего " + hoursPerHuman + " часов работы может быть поделено между сотрудниками");
    }
}