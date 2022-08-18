package gerenciador;

import java.util.Random;

public class DeckDeCartas {
    private Carta[] cartas;
    private String tipo;

    public DeckDeCartas(String tipo) {
        this.tipo = tipo;
        this.cartas = new Carta[16];
        if ("Sorte".equals(tipo)) {
            this.cartas[0] = new CartaDeMovimento(0, -6, EnumCarta.SORTE_01.getDescricao(), 1);
            this.cartas[1] = new CartaDeMovimento(0, -7, EnumCarta.SORTE_02.getDescricao(), 1);
            this.cartas[2] = new CartaDeMovimento(0, -8, EnumCarta.SORTE_03.getDescricao(), 1);
            this.cartas[3] = new CartaDeMovimento(0, -9, EnumCarta.SORTE_04.getDescricao(), 1);
            this.cartas[4] = new CartaDeMovimento(1, 5, EnumCarta.SORTE_05.getDescricao(), 1);
            this.cartas[5] = new CartaDeMovimento(-1, 3, EnumCarta.SORTE_06.getDescricao(), 1);
            this.cartas[6] = new CartaDeMovimento(0, -10, EnumCarta.SORTE_07.getDescricao(), 1);

            this.cartas[7] = new CartaDeDinheiro(-1, 50, EnumCarta.SORTE_08.getDescricao(), 2);
            this.cartas[8] = new CartaDeDinheiro(1, 75, EnumCarta.SORTE_09.getDescricao(), 2);
            this.cartas[9] = new CartaDeDinheiro(-1, 50, EnumCarta.SORTE_10.getDescricao(), 2);
            this.cartas[10] = new CartaDeDinheiro(1, 100, EnumCarta.SORTE_11.getDescricao(), 2);
            this.cartas[11] = new CartaDeDinheiro(1, 50, EnumCarta.SORTE_12.getDescricao(), 2);
            this.cartas[12] = new CartaDeDinheiro(1, 150, EnumCarta.SORTE_13.getDescricao(), 2);
            this.cartas[13] = new CartaDeDinheiro(-1, 40, EnumCarta.SORTE_14.getDescricao(), 2);
            this.cartas[14] = new CartaDeDinheiro(1, 200, EnumCarta.SORTE_15.getDescricao(), 2);

            this.cartas[15] = new CartaVaParaCadeia(EnumCarta.SORTE_16.getDescricao(), 0);
        } else if ("Cofre".equals(tipo)) {
            this.cartas[0] = new CartaDeMovimento(0, -1, EnumCarta.COFRE_01.getDescricao(), 1);
            this.cartas[1] = new CartaDeMovimento(0, -2, EnumCarta.COFRE_02.getDescricao(), 1);
            this.cartas[2] = new CartaDeMovimento(0, -3, EnumCarta.COFRE_03.getDescricao(), 1);
            this.cartas[3] = new CartaDeMovimento(0, -4, EnumCarta.COFRE_04.getDescricao(), 1);
            this.cartas[4] = new CartaDeMovimento(1, 2, EnumCarta.COFRE_05.getDescricao(), 1);
            this.cartas[5] = new CartaDeMovimento(-1, 4, EnumCarta.COFRE_06.getDescricao(), 1);
            this.cartas[6] = new CartaDeMovimento(0, -5, EnumCarta.COFRE_07.getDescricao(), 1);

            this.cartas[7] = new CartaDeDinheiro(1, 100, EnumCarta.COFRE_08.getDescricao(), 2);
            this.cartas[8] = new CartaDeDinheiro(1, 10, EnumCarta.COFRE_09.getDescricao(), 2);
            this.cartas[9] = new CartaDeDinheiro(1, 200, EnumCarta.COFRE_10.getDescricao(), 2);
            this.cartas[10] = new CartaDeDinheiro(1, 25, EnumCarta.COFRE_11.getDescricao(), 2);
            this.cartas[11] = new CartaDeDinheiro(-1, 75, EnumCarta.COFRE_12.getDescricao(), 2);
            this.cartas[12] = new CartaDeDinheiro(-1, 100, EnumCarta.COFRE_13.getDescricao(), 2);
            this.cartas[13] = new CartaDeDinheiro(1, 100, EnumCarta.COFRE_14.getDescricao(), 2);
            this.cartas[14] = new CartaDeDinheiro(-1, 45, EnumCarta.COFRE_15.getDescricao(), 2);

            this.cartas[15] = new CartaVaParaCadeia(EnumCarta.COFRE_16.getDescricao(), 0);
        }
    }

    public void embaralhar() {
        int j;
        Random r = new Random();
        for (int i = 15; i > 0; i--) {
            j = r.nextInt(i);
            if (j != i) {
                Carta temp = this.cartas[i];
                this.cartas[i] = this.cartas[j];
                this.cartas[j] = temp;
            }
        }
    }

    // Função retorna a primeira carta do deck e a devolve no fim.
    public Carta puxarCarta() {
        Carta tirada = this.cartas[15];
        for (int i = 15; i > 0; i--) {
            this.cartas[i] = this.cartas[i - 1];
        }
        this.cartas[0] = tirada;
        return tirada;
    }

}
