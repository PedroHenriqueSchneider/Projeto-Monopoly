package gerenciador;

public class ImpostoDeRenda extends Espaco {

    public ImpostoDeRenda(String nome) {
        super(nome);
    }

    // Retorna o imposto de Renda de cada jogador (calculo do saldo + valor das
    // propriedades + valor
    // das casas + valor dos hoteis)/10.
    public int calcular(Jogador j) {
        return (j.getSaldo() + j.ValorPropriedades() + j.valorCasas() + j.valorHoteis()) / 10;
    }

}
