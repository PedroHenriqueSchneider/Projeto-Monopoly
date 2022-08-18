package gerenciador;

public class Jogo {
    private Tabuleiro tabuleiro;
    private Jogador[] jogadores;
    private int nJogadores;
    private int turno;
    private Dado d1;
    private Dado d2;
    private DeckDeCartas cofre;
    private DeckDeCartas sorte;
    private Banco banco;

    public Jogo(int nJogadores, String jog1, String jog2) {
        this.tabuleiro = new Tabuleiro();
        this.nJogadores = nJogadores;
        this.jogadores = new Jogador[nJogadores];
        this.jogadores[0] = new Jogador(jog1);
        this.jogadores[1] = new Jogador(jog2);
        this.d1 = new Dado();
        this.d2 = new Dado();
        this.cofre = new DeckDeCartas("Cofre");
        this.sorte = new DeckDeCartas("Sorte");
        this.banco = new Banco();
    }

    public Jogo(int nJogadores, String jog1, String jog2, String jog3) {
        this.tabuleiro = new Tabuleiro();
        this.nJogadores = nJogadores;
        this.jogadores = new Jogador[nJogadores];
        this.jogadores[0] = new Jogador(jog1);
        this.jogadores[1] = new Jogador(jog2);
        this.jogadores[2] = new Jogador(jog3);
        this.d1 = new Dado();
        this.d2 = new Dado();
        this.cofre = new DeckDeCartas("Cofre");
        this.sorte = new DeckDeCartas("Sorte");
        this.banco = new Banco();
    }

    public Jogo(int nJogadores, String jog1, String jog2, String jog3, String jog4) {
        this.tabuleiro = new Tabuleiro();
        this.nJogadores = nJogadores;
        this.jogadores = new Jogador[nJogadores];
        this.jogadores[0] = new Jogador(jog1);
        this.jogadores[1] = new Jogador(jog2);
        this.jogadores[2] = new Jogador(jog3);
        this.jogadores[3] = new Jogador(jog4);
        this.d1 = new Dado();
        this.d2 = new Dado();
        this.cofre = new DeckDeCartas("Cofre");
        this.sorte = new DeckDeCartas("Sorte");
        this.banco = new Banco();
    }

}
