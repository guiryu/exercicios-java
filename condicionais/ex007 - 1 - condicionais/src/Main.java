import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite um número: ");
        x = sc.nextInt();
        if (x >= 0){
            System.out.println("O número digitado é positivo");
        }
        else{
            System.out.println("O núemro digitado é negativo");
        }

        sc.close();
    }
}