package gerenciador;

public class Cadeia extends Espaco {
    private final int fianca;

    public Cadeia(String nome) {
        super(nome);
        this.fianca = 50;
    }

    // A cadeia que prende o jogador (?)
    public void prender(Jogador j) {
        j.setPreso(true);
    }

    public int getFianca() {
        return this.fianca;
    }
}
