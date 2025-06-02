package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook(10);

        // добавим несколько сотрудников
        book.addEmployee("Иванов Иван Иванович",     1, 60_000);
        book.addEmployee("Петров Пётр Петрович",     2, 80_000);
        book.addEmployee("Сидорова Анна Владимировна",3, 75_000);
        book.addEmployee("Кузнецов Сергей Николаевич",1, 55_000);
        book.addEmployee("Орлова Ольга Сергеевна",   2, 90_000);

        System.out.println("— Все сотрудники —");
        book.printAll();

        System.out.printf("%nСумма затрат на ЗП: %.2f%n", book.totalSalary());
        System.out.println("Мин. зарплата: " + book.minSalaryEmployee());
        System.out.println("Макс. зарплата: " + book.maxSalaryEmployee());
        System.out.printf("Средняя зарплата: %.2f%n%n", book.averageSalary());

        System.out.println("— ФИО сотрудников —");
        book.printNames();

        System.out.println("\nИндексация +10 % всем:");
        book.indexAllSalaries(10);
        book.printAll();

        int dept = 2;
        System.out.printf("%nСотрудник отдела %d с мин. ЗП: %s%n",
                dept, book.minSalaryEmployee(dept));
        System.out.printf("Сумма затрат отдела %d: %.2f%n",
                dept, book.totalSalary(dept));

        System.out.printf("%nСотрудники с зарплатой < 75 000:%n");
        book.printEmployeesBySalaryLess(75_000);

        // удаление
        int idToRemove = 3;
        if (book.removeEmployee(idToRemove)) {
            System.out.printf("%nСотрудник id=%d удалён%n", idToRemove);
        }
        System.out.println("\nИтоговый список:");
        book.printAll();
    }
}