import java.util.Scanner;

public class Aula_08 {
    public static void main(String[] args) {
        boolean continuar = true;
        char opcao;
        Scanner entrada = new Scanner(System.in);
       
        while(continuar){
            System.out.println("Você está na matrix;");
            System.out.print("Digite o caractere especial para sair da matrix: ");
            opcao = entrada.next().charAt(0);
           
            if(opcao=='j'){
                continuar=false;
                System.out.println("Parabéns! Você conseguiu sair da Matrix!");
            }
            else{
                System.out.println("Você não está autorizado a sair da Matrix. Estude Java.");
            }
        } 
    }
}
