package gerenciador;

public class TaxaDeRiqueza extends Espaco {
    private int taxa;

    public TaxaDeRiqueza(String nome) {
        super(nome);
        this.taxa = 200;
    }

    public int getTaxa() {
        return this.taxa;
    }

}
