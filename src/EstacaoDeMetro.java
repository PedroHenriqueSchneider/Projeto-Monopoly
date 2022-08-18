package gerenciador;

public class EstacaoDeMetro extends Propriedade {

    protected int aluguel = 25; // Aluguel inicial.

    public EstacaoDeMetro(String nome) {
        super(nome);
    }

    public getAluguel() {
        return this.aluguel;
    }

    // Retorna o aluguel dobrado para cada nova Estação adquirida.
    public setAluguel(int aluguelASerAumentado) {
        this.aluguel = aluguelASerAumentado * 2;
        return this.aluguel;
    }

    @Override
    public int calcularAluguel() {
        /*
         * o aluguel começa em
         * $25, e dobra para cada nova Estação adquirida por
         * um mesmo jogador.
         * 
         * Portanto, o aluguel das Estações de Metrô pode va-
         * riar de $25 até $200.
         */

        return 0;

    }

}
