package br.com.senai.s042;

import java.util.Scanner;

public class MegaUna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, Seja bem vindo ao MegaUna!");
        System.out.println("Nesse jogo você escolhe um numero inteiro de 1 a 100, se acertar, ganha!");
        System.out.println("Digite um numero: ");

        int numEscolhido = sc.nextInt();
        int numSorteado = (int) (Math.random()*100+1);

        if (numEscolhido == numSorteado) {
            System.out.println("Parabéns! Você ganhou!");
            System.out.println("Obrigado pela participação. Espero que retorne em breve!");
            return;
        } else {
            System.out.println("Que pena! Não foi dessa vez! Espero que tenha mais sorte na próxima!");
        }
        System.out.println("Gostaria de continuar tentando?");
        String resposta = sc.next();

        while(resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um numero: ");
            numEscolhido = sc.nextInt();

            if (numEscolhido == numSorteado) {
                System.out.println("Parabéns! Você ganhou!");
                break;
            } else {
                System.out.println("Que pena! Não foi dessa vez! Espero que tenha mais sorte na próxima!");
            }
            System.out.println("Gostaria de continuar tentando? (Responda: sim / não");
            resposta = sc.next();
        }
        System.out.println("Obrigado pela participação. Espero que retorne em breve!");

    }
}