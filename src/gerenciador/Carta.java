package gerenciador;
/*
* @author: Gustavo Gonçalves de Souza Geraldelli
*/
public class Carta {
    protected String descricao;
    protected int tipoCarta; // para saber o tipo de carta, 0 = VaParaCadeia, 1 = Movimento, 2 = Dinheiro
    
    public Carta(String descricao, int tipoCarta){
        this.descricao = descricao;
        this.tipoCarta = tipoCarta;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public int getTipoCarta(){
        return this.tipoCarta;
    }
    
    public int getQtd(){
        return 999; // valores que não são válidos
    }
    
    public int getTipo(){
        return 999; // valores que não são válidos
    }
    
}
