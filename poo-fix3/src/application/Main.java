package application;
import entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student aluno = new Student();

        aluno.name = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();

        aluno.verify();

    }
}