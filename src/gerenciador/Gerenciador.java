package gerenciador;

import javax.swing.text.html.HTML;

public class Gerenciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Teste da classe de dados
//        Dado d1 = new Dado();
//        Dado d2 = new Dado();
//        for (int i = 0; i < 8; i++)
//            System.out.println(d1.rolar() + " " + d2.rolar());

        // Teste da classe decks de cartas e cartas
        DeckDeCartas cofre = new DeckDeCartas("Cofre");
            
//        for (int i = 0; i < 18; i++) {
//            Carta c = cofre.puxarCarta();
//            System.out.println(c.getTipoCarta() + " " + c.getDescricao() + " " + c.getTipo() + " " + c.getQtd());
//        }


        // Teste classe Tabuleiro
        Tabuleiro t = new Tabuleiro();
//        for(int i = 0; i < t.getEspacos(); i++)
//            System.out.println(t.espacos[i].getNome());
        

        // Testes classe Jogador
        Jogador j = new Jogador("Player 1", t);
        //System.out.println("Nome: " + j.getNome() + "\nSaldo: "+ j.getSaldo());
        System.out.println("Saldo:" + j.getSaldo());
        if(j.remSaldo(1600)){
            System.out.println("Removido 1600 reais");
        }else{
            System.out.println("Não posso remover 1600 reais");
        }
        System.out.println("Adicionando 100 reais ao jogador");
        j.addSaldo(100);
        if(j.remSaldo(1600)){
            System.out.println("Removido 1600 reais");
        }else{
            System.out.println("Não posso remover 1600 reais");
        }
        
        System.out.println("Novo saldo: " + j.getSaldo());
//        j.addSaldo(-100);
//        System.out.println(j.getSaldo());
//        
//        if(!j.getPreso()){
//            System.out.println("Jogador não está preso");
//        }else{
//            System.out.println("Jogador está preso");
//        }
//        j.setPreso(true);
//        if(!j.getPreso()){
//            System.out.println("Jogador não está preso");
//        }else{
//            System.out.println("Jogador está preso");
//        }
//        System.out.println("Jogador está inicialmente em: " + j.getEspacoAtual());
//        
    }

}
