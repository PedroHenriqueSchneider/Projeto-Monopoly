package gerenciador;
/*
* @author: Gustavo Gonçalves de Souza Geraldelli
*/
public class CartaDeMovimento extends Carta {
    private final int tipo; // 1 para frente, 0 para lugar especifico e -1 para tras

    // -1 = Niteroi, -2 = Oscar Freire, -3 = 25 de Março, -4 = Leblon, -5 =
    // Utilidade mais proxima
    // -6 = Partida, -7 = Jardim Botanico, -8 = Juscelino K, -9 = Praça da Sé, -10 =
    // Metro mais proximo
    private final int qtd; // numero de movimentos

    public CartaDeMovimento(int tipo, int qtd, String descricao, int movimento) {
        super(descricao, movimento);
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
