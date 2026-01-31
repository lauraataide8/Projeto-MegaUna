package br.com.senai.s042;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    Random rd = new Random();
    private int numSorteado;
    private int tentativas;

    public Jogo() {
        this.numSorteado = rd.nextInt(100) + 1;
        this.tentativas = 3;
    }

    public int getNumSorteado() {
        return numSorteado;
    }
    public int getTentativas() {
        return tentativas;
    }
    public static void cumprimentar() {
        System.out.println("Seja bem vindo ao MegaUna!");
    }
    public static void apresentarInformacoes() {
        System.out.println("Nesse jogo você escolhe um número inteiro de 1 a 100 e, se acertar, ganha!");
    }
    public static String coletarNome(Scanner sc) {
        String jogador;
        System.out.println("Informe seu nome:");
        jogador = sc.next();
        sc.nextLine();
        System.out.println("Olá, " + jogador + "!");
        return jogador;
    }
    public static void jogar(Scanner sc, String jogador, int numSorteado, int tentativas) {
        String resposta;
        int numEscolhido;
        do {
            System.out.println(jogador + ", digite um número:");
            numEscolhido = sc.nextInt();
            tentativas--;
            if(numEscolhido == numSorteado) {
                System.out.println("Parabéns, " + jogador + "! Você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + jogador + "! Não foi desta vez! Espero que tenha mais sorte na próxima!");
            }
            System.out.println("Gostaria de continuar tentando? (Responda: sim / não)");
            resposta = sc.next();
        } while(resposta.equalsIgnoreCase("sim") && tentativas > 0);
    }
    public static void finalizarJogo(String jogador) {
        System.out.println("Ok. Obrigado pela participação, " + jogador + ". Espero que retorne em breve!");
    }
}