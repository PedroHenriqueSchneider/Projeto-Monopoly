package gerenciador;

import java.util.Scanner;

public class Gerenciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Teste dos dados
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        for (int i = 0; i < 20; i++)
            System.out.println(d1.rolar() + " " + d2.rolar());

        // Teste dos decks e cartas
        DeckDeCartas cofre = new DeckDeCartas("Cofre");
        DeckDeCartas sorte = new DeckDeCartas("Sorte");

        for (int i = 0; i < 16; i++) {
            Carta c = cofre.puxarCarta();
            System.out.println(c.getTipoCarta() + " " + c.getDescricao() + " " + c.getTipo() + " " + c.getQtd());
        }

        for (int i = 0; i < 16; i++) {
            Carta c = sorte.puxarCarta();
            System.out.println(c.getTipoCarta() + " " + c.getDescricao() + " " + c.getTipo() + " " + c.getQtd());
        }

        cofre.embaralhar();
        System.out.println("\n\nDepois de embaralhar:");
        for (int i = 0; i < 16; i++) {
            Carta c = cofre.puxarCarta();
            System.out.println(c.getTipoCarta() + " " + c.getDescricao() + " " + c.getTipo() + " " + c.getQtd());
        }

        // Teste tabuleiro
        Tabuleiro t = new Tabuleiro();
        System.out.println(t.espacos[1].getNome());

    }

}
