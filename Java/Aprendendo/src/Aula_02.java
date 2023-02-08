import java.util.Scanner;

public class Aula_02 {
    public static void main(String[] args) {
     
    /* 
     1) Entrada de dados
     2) processamento de dados
     3) saída de dados
     */
       
     System.out.println("Informe a idade do seu cachorro: ");
     Scanner idade = new Scanner(System.in);

     int idadeCachorro = idade.nextInt();
     idadeCachorro = idadeCachorro * 7;

     System.out.println("O seu cachorro tem " + idadeCachorro);

    }
}

