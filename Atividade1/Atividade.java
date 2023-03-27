package Atividade1;

import java.util.Scanner;

public class Atividade {
    Scanner scan = new Scanner(System.in);

    public void atividadeUm() {
        System.out.println("Digite dois números e depois escolha uma das operações aritméticas.");
        System.out.println("Digite o primeiro número do cálculo: ");
        int numeroUm = scan.nextInt();
        System.out.println("Digite o segundo número do cálculo: ");
        int numeroDois = scan.nextInt();
        System.out.println("Agora escolha qual operação quer fazer: \n 1. Adição \n 2. Subtração \n 3. Multiplicação \n 4. Divisão");
        int operacaoAritmetica = scan.nextInt();
        if (operacaoAritmetica==1){System.out.println("O resultado de "+numeroUm+" mais "+numeroDois+ "é igual à: "+numeroUm+numeroDois+".");}
        else if (operacaoAritmetica==2){System.out.println("O resultado de "+numeroUm+" menos "+numeroDois+" é igual à: "+(numeroUm - numeroDois)+".");}
        else if (operacaoAritmetica==3){System.out.println("O resultado de "+numeroUm+" multiplicado por "+numeroDois+" é igual à: "+numeroUm * numeroDois+".");}
        else if (operacaoAritmetica==4&&numeroDois==0){System.out.println("Não é possível dividir um número por 0.");}
        else {System.out.println("O resultado de "+numeroUm+" dividido por "+numeroDois+" é igual à: "+numeroUm / numeroDois+".");};
    }
}
