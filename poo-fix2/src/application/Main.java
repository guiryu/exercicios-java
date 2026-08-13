package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");

        employee.increaseSalary(sc.nextDouble());

        System.out.println();
        System.out.println("Updated data: "+ employee);

        sc.close();
    }
}