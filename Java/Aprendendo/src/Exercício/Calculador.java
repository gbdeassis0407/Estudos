package Exercício;

import java.util.Scanner;

public class Calculador {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    Operacoes calcula = new Operacoes(); //cria objeto na classe Operacoes

    Numero n1 = new Numero();  //criar objeto na classe Numero
    Numero n2 = new Numero();  //criar objeto na classe Numero
    Numero res = new Numero(); //criar objeto na classe Numero

    System.out.println("Digite o primeiro valor: ");
    n1.setValor(in.nextFloat()); // armazena valor no objeto da classe Numero
    
    System.out.println("Digite o segundo valor: ");
    n2.setValor(in.nextFloat()); // armazena valor no objeto da classe Numero

    res.setValor(calcula.mult(n1.getValor(), n2.getValor())); //Chama função da classe Operacoes para calculo
    System.out.println(res.getValor());


 /*    res.setValor(n1.getValor() + n2.getValor());
    System.out.println("A soma de " + n1.getValor() + " com " + n2.getValor() + " = " + res.getValor()); */

    }
}
