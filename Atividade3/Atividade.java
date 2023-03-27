package Atividade3;

import java.util.Scanner;

public class Atividade {
    Scanner scan = new Scanner(System.in);
    public void atividadeTres() {
        System.out.println("Preços da quitanda do Seu Madruga: \n Morangos: R$3,50/kg \n Maçãs: R$2,30/kg \n Bananas: R$1,80/kg.");
        System.out.println("Quantos kg de morangos você vai querer?");
        int kgMorango = scan.nextInt();
        double precoMorango = kgMorango*3.5;
        System.out.println("Quantos kg de maçãs você vai querer?");
        int kgMacas = scan.nextInt();
        double precoMacas = kgMacas*2.3;
        System.out.println("Quantos kg de banana você vai querer?");
        int kgBananas = scan.nextInt();
        double precoBananas = kgBananas*1.8;
        double valorTotal=precoMorango+precoMacas+precoBananas;
        double pesoTotal=kgMorango+kgMacas+kgBananas;
        double desconto = valorTotal*10/100;
        if (pesoTotal>15){System.out.println("Você vai pagar R$"+(valorTotal-desconto)+" com o desconto de 10%.");}
        else if (valorTotal>30){System.out.println("Você vai pagar R$"+(valorTotal-desconto)+" com o desconto de 10%.");}
        else {System.out.println("Você vai pagar R$"+valorTotal);}
    }
}
