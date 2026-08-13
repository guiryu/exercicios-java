package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Pessoa;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i=0; i<vect.length; i++){
            System.out.printf("Dados da %d pessoa:\n", i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double sumAltura = 0;
        for (int i=0; i<vect.length; i++){
            sumAltura += vect[i].getAltura();
        }
        double mediaAltura = sumAltura/ vect.length;
        System.out.printf("Altura média: %.2f\n", mediaAltura);

        double menosDe16 = 0;
        System.out.println("Tem menos de 16 anos: ");
        for (int i=0; i<vect.length; i++){
            if (vect[i].getIdade() < 16){
                menosDe16 +=1;
                System.out.println(vect[i].getNome());
            }
        }
        double porcentagem = menosDe16/ vect.length * 100;
        System.out.printf("Pessoas com menos de 16: %.2f%% %n", porcentagem);  // '%%' é usado para mostrar o símbolo de porcentagem

        sc.close();
    }
}