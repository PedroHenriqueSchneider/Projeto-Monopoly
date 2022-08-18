package gerenciador;

public class Lote extends Propriedade {
    private String cor;
    private int aluguel;
    private int precoCasa;
    private int precoHotel;
    private int aluguelComCasa;

    public Lote(String nome, String cor, int aluguel, int precoCasa, int precoHotel, int aluguelComCasa) {
        super(nome);
        this.cor = cor;
        this.aluguel = aluguel;
        this.precoCasa = precoCasa;
        this.precoHotel = precoHotel;
        this.aluguelComCasa = aluguelComCasa;
    }

    @Override
    public int calcularAluguel() {

        return 0;

    }

}
