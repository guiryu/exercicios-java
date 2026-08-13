import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo;
        int alcool = 0, gasolina = 0, diesel = 0;
        System.out.print("Código: ");
        codigo = sc.nextInt();

        while (codigo < 1 || codigo > 4) {
            System.out.print("Código inválido. Código: ");
            codigo = sc.nextInt();
        }

        while (codigo != 4){
            if (codigo == 1){
                alcool += 1;
            }
            else if (codigo == 2){
                gasolina += 1;
            }
            else{
                diesel += 1;
            }
            System.out.print("Código: ");
            codigo = sc.nextInt();
            while (codigo < 1 || codigo > 4){
                System.out.print("Código inválido. Código: ");
                codigo = sc.nextInt();
            }
        }

        System.out.println("=============\nMUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);


        sc.close();
    }
}