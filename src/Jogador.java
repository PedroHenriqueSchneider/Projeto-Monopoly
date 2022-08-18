package gerenciador;

public class Jogador {
    private String nome;
    private int saldo;
    private Espaco espacoAtual;
    private Propriedade[] propriedades;
    private boolean estaPreso;
    private int duplas;

    // Variaveis auxiliares

    private int estacoes; // guarda quantas estacoes o jogador possui

    public Jogador(String nome) {
        this.nome = nome;
        this.estaPreso = false;
        this.duplas = 0;
        this.saldo = 1500;
        this.espacoAtual = Tabuleiro.espacos[0]; // ta certo assim (?)
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setEspacoAtual(Espaco espacoAtual) {
        this.espacoAtual = espacoAtual;
        /*
         * if ("Ponto de Partida".equals(this.espacoAtual.nome))
         * this.saldo += PontoDePartida.getValor();
         */
    }

    public String getEspacoAtual() {
        return this.espacoAtual.getNome();
    }

    // Função que lança os dados da classe Dado.
    // Retorna o dado 1 mais o dado 2.

    public int lancarDados(Dado d1, Dado d2) {
        int dado1 = d1.rolar();
        int dado2 = d2.rolar();

        if (dado1 == dado2)
            this.duplas++;
        else
            this.duplas = 0;

        return dado1 + dado2;
    }

    public boolean jogouTresDuplas() {
        return this.duplas == 3;
    }

    public void setPreso(boolean p) {
        this.estaPreso = p;
    }

    public void addSaldo(int saldo) {
        this.saldo += saldo;
    }

    // Função retorna true se for possivel remover o saldo, senão retorna false
    public boolean remSaldo(int saldo) {
        if (saldo > this.saldo)
            return false;
        else
            this.saldo -= saldo;
    }

}
