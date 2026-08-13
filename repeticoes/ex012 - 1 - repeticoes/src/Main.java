import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha = sc.nextInt();
        while (senha != senhaCorreta){
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta. Acesso permitido");
        sc.close();
    }
}