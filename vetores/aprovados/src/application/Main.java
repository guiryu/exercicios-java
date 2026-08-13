package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Aluno;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();

        Aluno[] vect = new Aluno[n];

        for (int i=0; i<n; i++){
            System.out.println("Digite nome, primeira nota e segunda nota do aluno " + (i+1));
            sc.nextLine();
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            vect[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos Aprovados: ");

        for (int i=0; i<n; i++){
            if (vect[i].Media() > 6.0){
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}