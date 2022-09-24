package gerenciador;
/*
* @author: Gustavo Gonçalves de Souza Geraldelli
*/
public class CartaVaParaCadeia extends Carta {
    private final int tipo;
    private final int qtd;
    public CartaVaParaCadeia(String descricao, int cadeia) {
        super(descricao, cadeia);
        this.tipo = 0;
        this.qtd = 1;
    }
    @Override
    public int getTipo(){
        return this.tipo;
    }
    
    @Override
    public int getQtd(){
        return this.qtd;
    }

}
