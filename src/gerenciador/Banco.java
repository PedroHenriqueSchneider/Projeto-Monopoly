package gerenciador;

public class Banco {
  // Função que adiciona saldo ao jogador.
  public void pagarJogador(Jogador j, int valor) {
    j.addSaldo(valor);
  }

  // Função que retira saldo do jogador.
  public boolean cobrarJogador(Jogador j, int valor) {
    if (j.remSaldo(valor)){
        return true;
    } 
    // Jogador entrou em falencia com o banco.
    return false;    
    // j.removerPropriedades()
  }

  public void intermediar(Jogador j1, Jogador j2, int valor) {
    if (!j1.remSaldo(valor)) { // Jogador 1 entrou em falencia devido a outro jogador.
      j2.addSaldo(j1.getSaldo()); // Jogador 2 recebe todo seu saldo.
      j1.remSaldo(j1.getSaldo()); // Saldo do jogador é zerado.

      // j1 tem que passar propriedades para j2
    } else {
      j2.addSaldo(valor); // Senão, recebe o valor esperado.
    }
  }

}
