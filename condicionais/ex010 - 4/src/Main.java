import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;
        inicio = sc.nextInt();
        fim = sc.nextInt();
        if (inicio > fim){
            duracao = 24 - inicio + fim;
            System.out.printf("O jogo teve duração de %d hora(s)", duracao);
        }
        else if (inicio < fim){
            duracao = fim - inicio;
            System.out.printf("O jogo teve duração de %d hora(s)", duracao);
        }
        else{
            duracao = 24;
            System.out.printf("O jogo teve duração de %d hora(s)", duracao);
        }

        sc.close();
    }
}