package br.com.senai.s042;

import java.util.Random;
import java.util.Scanner;

public class MegaUnaV1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String resposta;
        int numEscolhido;
        String jogador;
        int numSorteado = rd.nextInt(100)+1;
        // System.out.println("Numero sorteado: "+ numSorteado); apenas para teste
        System.out.println("Seja bem vindo ao MegaUna!");
        System.out.println("Informe seu nome:");
        jogador = sc.next();
        sc.nextLine();
        System.out.println("Olá,"+jogador+ "!");
        System.out.println("Nesse jogo você escolhe um numero inteiro de 1 a 100, se acertar, ganha!");
        do {
            System.out.println(jogador + ", Digite um numero: ");
            numEscolhido = sc.nextInt();
            if (numEscolhido == numSorteado) {
                System.out.println("Parabéns, " + jogador + "Você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + jogador + "! Não foi dessa vez! Espero que tenha mais sorte na próxima!");
            }

            System.out.println("Gostaria de continuar tentando? (Responda: sim / não)");
            resposta = sc.next();

        } while(resposta.equalsIgnoreCase("sim"));
        System.out.println("Ok, obrigado pela participação, " + jogador +". Espero que retorne em breve!");
    }
}
