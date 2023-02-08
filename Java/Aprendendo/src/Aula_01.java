import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Aula_01{
    public static void main(String[] args) {
        // System.out.println("Alo Mundo");
        int num = 0;
        int minhaVariavel = 100;

        System.out.println("meu valor inutil" +num);
        System.out.println("me passa a grana" + minhaVariavel);

        double dinheiro = 1.55;
        System.out.println("To pobre " + dinheiro);

        // declarando variaveis
        // int num1 = 1;
        // char caractere = 'x';
        // boolean flag = true;
        // String a2b3 = "quaquer texto....";

        // Não podem ser utilizados caracteres especiais
        /* ç / = ! @ # $ % & / () {} [] ^ ~ ´ */

        // como não declara variaveis
        /* int 4num = 0; // ERRO
        String 3 = "Informe se nome" //ERRO
        float 2d = 4; // ERRO */


        int num1 = 100, num2 = num1 + 100;
        String s = "";

        System.out.println("O resultado é: " + num2);
        System.out.println("Num1 e igual: " + num1);

        int i = 1111;

        System.out.println("Digite um numero: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Seu numero é: " + in.nextLine());

    }
}