import java.util.Scanner;

public class Aula_04 {
    public static void main(String[] args) {
        
        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int num = in.nextInt();

        if(num > 50) {
            System.out.println("O numero digitado e maior do que cinquenta.");

        } */
        
        /* 
        int num;
        System.out.println("Digite o numero 1: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if(num == 1){
            System.out.println("Obrigado por digitar o número 1");

        }else{
            System.out.println("O numero digitado não é igual a 1");
        } */
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite '1'para sim e digite '0' para não: ");

        int acao = in.nextInt();

        if(acao==1){
            System.out.println("Você disse que sim!");
        }

        if (acao==0){
            System.out.println("voce disse que não!");
        }


    }
}
