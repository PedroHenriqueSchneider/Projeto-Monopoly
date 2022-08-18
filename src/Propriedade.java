package gerenciador;

public abstract class Propriedade extends Espaco {
    protected int precoDeCompra;
    protected Jogador comprador;

    public abstract int calcularAluguel();

    public Propriedade(String nome) {
        super(nome);
    }
}
