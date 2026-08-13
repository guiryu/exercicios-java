package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import entities.Employee;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();
        List<Integer> ids = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Double> salaries = new ArrayList<>();

        Employee[] vect = new Employee[n];


        for (int i=0; i < n; i++){
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(ids, id)){
                System.out.print("Id already exists. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            ids.add(id);
            names.add(name);
            salaries.add(salary);

            vect[i] = new Employee(id, name, salary);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int empInc = sc.nextInt();
        System.out.println();

        Integer emp = ids.stream().filter(x -> x.intValue() == empInc).findFirst().orElse(null);
        if (emp == null){
            System.out.println("Does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            System.out.println();
            int idIncrease = ids.indexOf(empInc);

            vect[idIncrease].increase(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (int i=0; i<vect.length; i++){
            System.out.printf("%d, %s, %.2f\n", vect[i].getId(), vect[i].getName(), vect[i].getSalary());
        }

        sc.close();
    }
    public static boolean hasId(List<Integer> list, int id) {
        Integer emp = list.stream().filter(x -> x.intValue() == id).findFirst().orElse(null);
        return emp != null;
    }
}
