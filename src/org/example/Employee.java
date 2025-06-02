package org.example;

import java.util.Objects;

public class Employee {
    private static int idCounter = 1;

    private final int id;
    private final String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        }
        this.fullName  = fullName;
        this.department = department;
        this.salary    = salary;
        this.id        = idCounter++;
    }

    /* ----------- геттеры ----------- */

    public int getId()           { return id; }
    public String getFullName()  { return fullName; }
    public int getDepartment()   { return department; }
    public double getSalary()    { return salary; }

    /* ---------- сеттеры ------------ */

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* ---------- контракты ---------- */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /* ----------- toString ----------- */

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', dept=%d, salary=%.2f}",
                id, fullName, department, salary);
    }
}