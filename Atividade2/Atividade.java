package Atividade2;

import java.util.Scanner;

public class Atividade {
    Scanner scan = new Scanner(System.in);
    public void atividadeDois() {
        System.out.println("Existem quatro times para serem dividos os alunos: \n Time Chris \n Time Greg \n Time Caruso \n Time Jerome \n Os times serão divididos dependendo do número da matrícula do aluno.");
        System.out.println("Digite o número da matrícula do aluno:");
        int numeroMatricula = scan.nextInt();
        int restoDivisao = numeroMatricula % 4;
        if (restoDivisao==0){System.out.println("O aluno é do time Chris");}
        else if (restoDivisao==1){System.out.println("O aluno é do time Greg");}
        else if (restoDivisao==2){System.out.println("O aluno é do time Caruso");}
        else if (restoDivisao==3){System.out.println("O aluno é do time Jerome");}
    }
}
