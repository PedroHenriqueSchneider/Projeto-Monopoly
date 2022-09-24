package gerenciador;
/*
* @author: Gustavo Gonçalves de Souza Geraldelli
*/
public class CartaDeDinheiro extends Carta {
    private final int tipo; // 1 para adiçao e -1 para remoçao
    private final int qtd; // valor para adicionar/remover

    public CartaDeDinheiro(int tipo, int qtd, String descricao, int dinheiro) {
        super(descricao, dinheiro);
        this.tipo = tipo;
        this.qtd = qtd;
    }

    @Override
    public int getTipo() {
        return this.tipo;
    }

    @Override
    public int getQtd() {
        return this.qtd;
    }

}
