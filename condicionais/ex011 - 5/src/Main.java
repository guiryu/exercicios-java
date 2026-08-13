import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco, total;

        System.out.print("Código e quantidade: ");
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch(codigo){
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                preco = 0;
                break;
        }

        total = quantidade * preco;
        System.out.printf("Total: R$%.2f\n  ", total);

        sc.close();
    }
}