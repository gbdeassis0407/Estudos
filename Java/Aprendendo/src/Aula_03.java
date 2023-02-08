import java.util.Scanner;

public class Aula_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, soma, subtracao, multi, divi;

        System.out.println("Insira um numero: ");
        num1 = in.nextInt();

        System.out.println("Insira um segundo numero: ");
        num2 = in.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        
        System.out.println("O resultado da soma = " + soma);
        System.out.println("O resultado da subtração = " + subtracao);
        System.out.println("O resultado da multiplicação = " + multi);
        System.out.println("O resultado da divisão = " + divi);

    }
}
