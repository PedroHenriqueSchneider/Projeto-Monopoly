package gerenciador;

public class PontoDePartida extends Espaco {
    private static final int valor = 200;

    public PontoDePartida(String nome) {
        super(nome);
    }
    
    public static int getValor(){
        return PontoDePartida.valor;
    }
}
