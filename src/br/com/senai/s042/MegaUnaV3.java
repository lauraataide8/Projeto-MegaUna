package br.com.senai.s042;

import java.util.Scanner;

public class MegaUnaV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogo j1 = new Jogo();

        //Código hackeado:
        //j1.numSorteado = 15; Isso não funciona mais!!!

        Jogo.cumprimentar();
        String gamer = Jogo.coletarNome(scan);
        Jogo.apresentarInformacoes();
        Jogo.jogar(scan, gamer, j1.getNumSorteado(), j1.getTentativas());
        Jogo.finalizarJogo(gamer);
    }
}