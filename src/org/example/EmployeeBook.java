package org.example;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int capacity) {
        this.employees = new Employee[capacity];
    }

    /* ---------- CRUD ---------- */

    /** Добавить сотрудника, возвращает true если место нашлось */
    public boolean addEmployee(String fullName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
                return true;
            }
        }
        return false; // массив заполнен
    }

    /** Удалить сотрудника по id; true — успешно */
    public boolean removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    /** Получить сотрудника по id */
    public Employee getEmployeeById(int id) {
        return Arrays.stream(employees)
                .filter(e -> e != null && e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /* ---------- базовые задачи ---------- */

    /** Вывести всех сотрудников */
    public void printAll() {
        Arrays.stream(employees)
                .filter(e -> e != null)
                .forEach(System.out::println);
    }

    /** Сумма затрат на ЗП */
    public double totalSalary() {
        return Arrays.stream(employees)
                .filter(e -> e != null)
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    /** Сотрудник с мин. ЗП */
    public Employee minSalaryEmployee() {
        return Arrays.stream(employees)
                .filter(e -> e != null)
                .min((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
                .orElse(null);
    }

    /** Сотрудник с макс. ЗП */
    public Employee maxSalaryEmployee() {
        return Arrays.stream(employees)
                .filter(e -> e != null)
                .max((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
                .orElse(null);
    }

    /** Средняя ЗП */
    public double averageSalary() {
        long count = Arrays.stream(employees).filter(e -> e != null).count();
        return count == 0 ? 0 : totalSalary() / count;
    }

    /** Печать ФИО всех сотрудников */
    public void printNames() {
        Arrays.stream(employees)
                .filter(e -> e != null)
                .map(Employee::getFullName)
                .forEach(System.out::println);
    }

    /* ---------- повышенная сложность ---------- */

    /** Индексация зарплаты всех сотрудников на percent % */
    public void indexAllSalaries(double percent) {
        Arrays.stream(employees)
                .filter(e -> e != null)
                .forEach(e -> e.setSalary(e.getSalary() * (1 + percent / 100)));
    }

    /* ----- операции по отделу ----- */

    private Employee employeeByDept(int dept, boolean min) {
        return Arrays.stream(employees)
                .filter(e -> e != null && e.getDepartment() == dept)
                .min((a, b) -> min
                        ? Double.compare(a.getSalary(), b.getSalary())
                        : Double.compare(b.getSalary(), a.getSalary()))
                .orElse(null);
    }

    public Employee minSalaryEmployee(int dept) { return employeeByDept(dept, true); }
    public Employee maxSalaryEmployee(int dept) { return employeeByDept(dept, false); }

    public double totalSalary(int dept) {
        return Arrays.stream(employees)
                .filter(e -> e != null && e.getDepartment() == dept)
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    public double averageSalary(int dept) {
        double sum = totalSalary(dept);
        long count = Arrays.stream(employees)
                .filter(e -> e != null && e.getDepartment() == dept)
                .count();
        return count == 0 ? 0 : sum / count;
    }

    /** Индексация ЗП сотрудников отдела */
    public void indexDepartmentSalaries(int dept, double percent) {
        Arrays.stream(employees)
                .filter(e -> e != null && e.getDepartment() == dept)
                .forEach(e -> e.setSalary(e.getSalary() * (1 + percent / 100)));
    }

    /** Печать сотрудников отдела (без номера отдела) */
    public void printDepartmentEmployees(int dept) {
        Arrays.stream(employees)
                .filter(e -> e != null && e.getDepartment() == dept)
                .forEach(e -> System.out.printf("id=%d, name=%s, salary=%.2f%n",
                        e.getId(), e.getFullName(), e.getSalary()));
    }

    /* ----- фильтрация по зарплате ----- */

    public void printEmployeesBySalaryLess(double threshold) {
        printBySalary(e -> e.getSalary() < threshold);
    }

    public void printEmployeesBySalaryGreaterOrEqual(double threshold) {
        printBySalary(e -> e.getSalary() >= threshold);
    }

    private void printBySalary(Predicate<Employee> predicate) {
        Arrays.stream(employees)
                .filter(e -> e != null && predicate.test(e))
                .forEach(e -> System.out.printf("id=%d, name=%s, salary=%.2f%n",
                        e.getId(), e.getFullName(), e.getSalary()));
    }
}