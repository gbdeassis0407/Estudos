import java.util.Scanner;

public class Aula_05 {
    public static void main(String[] args) {
        
        //Constante valor que não pode ser alterada na execução do codigo
        final String MEUNOME = "Guilherme Borges de Assis";
        final double VELOCIDADE_SOM = 340.29; // m/s
        final double VELOCIDADE_LUZ =  299.792458;// m/s
        final double PI = 3.14159;

        /* 
        1) os dados nunca serão alterados
        2) uma constante tem o seu endereço protegido
        3) uma constante nunca sera desalocada
        4)declaramos uma vez, utilizamos quantas vezes forem necessárias
         */
        
        /* 
        int var = 10; // declaração de variavel
        final int constante = 10; // declaração de constantes

        System.out.println(var);
        System.out.println(constante); */

        System.out.println("Digite o espaço de tempo: ");
        Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();

        System.out.println("A distancia seria de : "+ tempo + VELOCIDADE_SOM + " metro percorrigos.");

        System.out.println("A distancia seria de : " + (tempo + VELOCIDADE_SOM) / 1000 + " Km percorridos.");


    }
}
