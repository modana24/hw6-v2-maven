package me.skypro_hw6v2;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;


    // конструктор
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //геттеры
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Employee(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String etoString() {
        return "me.skypro_hw6v2.Employee{" +
                firstName + lastName +
                '}';
    }

}
