package gerenciador;

public class Jogador {
    private String nome;
    private int saldo;
    private Espaco espacoAtual;
    private Propriedade[] propriedades;
    private boolean estaPreso;
    private int dadoDuplas;

    // Variaveis auxiliares

    private int estacoes; // guarda quantas estacoes o jogador possui

    public Jogador(String nome, Tabuleiro t) {
        this.nome = nome;
        this.estaPreso = false;
        this.dadoDuplas = 0;
        this.saldo = 1500;
        this.espacoAtual = t.espacos[0]; // ta certo assim (?)
    }
    public String getNome(){
        return this.nome;
    }
    public int getSaldo() {
        return this.saldo;
    }
    public String getEspacoAtual() {
        return this.espacoAtual.getNome();
    }
    public void setEspacoAtual(Espaco espacoAtual) {
        this.espacoAtual = espacoAtual;
        /*
         * if ("Ponto de Partida".equals(this.espacoAtual.nome))
         * this.saldo += PontoDePartida.getValor();
         */
    }
    
    /* Função que lança os dados da classe Dado.
    *  Caso iguais somamos ao contatos de duplas.
    *  Retorna a soma dos dois dados.
    */
    public int lancarDados(Dado d1, Dado d2) {
        int dado1 = d1.rolar();
        int dado2 = d2.rolar();

        if (dado1 == dado2)
            this.dadoDuplas++;
        else
            this.dadoDuplas = 0;

        return dado1 + dado2;
    }

    //Retorna verdadeiro caso o jogador tenha rolado 3 vezes os dados iguais.
    public boolean jogouTresDuplas() {
        return this.dadoDuplas == 3;
    }
    public boolean getPreso(){
        return this.estaPreso;
    }
    public void setPreso(boolean p) {
        this.estaPreso = p;
    }
    // Adiciona um saldo não negativo a conta do jogador
    public void addSaldo(int saldo) {
        if(saldo < 0)
            return;
        this.saldo += saldo;
    }
    // Função retorna true se for removido o saldo, senão retorna false
    public boolean remSaldo(int saldo) {
        if (saldo > this.saldo)
            return false;
        else
            this.saldo -= saldo;
        return true;
    }

}
