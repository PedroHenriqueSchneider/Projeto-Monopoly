package gerenciador;

public class Utilidade extends Propriedade {

    protected int aluguel;

    /*
     * 
     * são as ́unicas propriedades sem aluguel
     * fixo. Caso um jogador possua apenas uma Utilidade,
     * o aluguel ́e o valor obtido nos dados multiplicado
     * por 4. Caso o jogador possua ambas as Utilidades,
     * o valor obtido nos dados ́e multiplicado por 10.
     * Exemplo: Caso vocˆe possua uma Utilidade e outro
     * jogador pare nela ap ́os retirar 7 nos dados, o aluguel
     * recebido ser ́a igual a 7 x 4 = $28.
     * Caso vocˆe possua ambas as Utilidades para a mesma
     * situa ̧c ̃ao, o aluguel recebido ser ́a igual a 7 x 10 = $70.
     * 
     */

    public Utilidade(String nome) {
        super(nome);
    }

//    public setAluguel() {
//        
//    }

    @Override
    public int calcularAluguel(int valor) {
        return 0;
    }

}
