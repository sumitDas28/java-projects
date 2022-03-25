package com.csv.functional.programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP08CustomClass {

    public static void main(String[] args) {

        var employees = List.of(new Employee("101", "sumit", 1000),
                new Employee("102", "zachary", 3000),
                new Employee("109", "zeeshan", 3000),
                new Employee("105", "sam", 5000),
                new Employee("106", "tam", 5000),
                new Employee("107", "jam", 8000));

        //allMatch, noneMatch, anyMatch
        System.out.println(employees.stream().allMatch(employee -> employee.getSalary() > 3000));
        System.out.println(employees.stream().noneMatch(employee -> employee.getSalary() > 3000));
        System.out.println(employees.stream().anyMatch(employee -> employee.getSalary() > 3000));

        //sort increasing
        System.out.println(employees.stream().
                                sorted(Comparator.comparing(Employee::getSalary)).
                                collect(Collectors.toList()));

        //decreasing
        System.out.println(employees.stream().
                                sorted(Comparator.comparing(Employee::getSalary).reversed()).
                                collect(Collectors.toList()));

        //thenComparing, limit
        System.out.println(employees.stream().
                sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getEmployeeName)).
                limit(3).
                collect(Collectors.toList()));

        //takeWhile
        System.out.println(employees.stream().
                takeWhile(employee -> employee.getSalary()<5000).
                collect(Collectors.toList()));

        //dropWhile
        System.out.println(employees.stream().
                dropWhile(employee -> employee.getSalary()<5000).
                collect(Collectors.toList()));

        //max
        System.out.println(employees.stream().
                max(Comparator.comparing(employee -> employee.getSalary())));
        //min
        System.out.println(employees.stream().
                min(Comparator.comparing(employee -> employee.getSalary())));

        //optional
        System.out.println(employees.stream().
                filter(employee -> employee.getSalary()>10000).
                min(Comparator.comparing(employee -> employee.getSalary())).
                orElse(new Employee("0","",0)));

        System.out.println(employees.stream().
                filter(employee -> employee.getSalary()<10000).
               findFirst());

        // sum of all salaries as per filter criteria
        System.out.println(employees.stream().
                filter(employee -> employee.getSalary()<5000).
                mapToLong(employee -> employee.getSalary()).
                sum());

        //group employees by salary
        System.out.println(employees.stream().
                       //     collect(Collectors.groupingBy(employee -> employee.getSalary())));
                               //  collect(Collectors.groupingBy(Employee::getSalary)));
                               collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting())));


        //group employees by salary
        System.out.println(employees.stream().
                        collect(Collectors.groupingBy(Employee::getSalary,
                                Collectors.maxBy(Comparator.comparing(Employee::getEmployeeId)))));

        //group employees by salary
        System.out.println(employees.stream().
                collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getEmployeeName, Collectors.toList()))));
    }
}

class Employee {
    private String employeeId;
    private String employeeName;
    private long salary;

    public Employee(String employeeId, String employeeName, long salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}