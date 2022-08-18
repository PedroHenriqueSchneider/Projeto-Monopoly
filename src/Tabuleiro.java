package gerenciador;

public class Tabuleiro {
    public static Espaco[] espacos;
    private GrupoDoLote[] gruposLotes;

    public Tabuleiro() {

        // Espaços pré-definidos da tabela.
        Tabuleiro.espacos = new Espaco[40];
        this.gruposLotes = new GrupoDoLote[8];
        Tabuleiro.espacos[0] = new PontoDePartida(NomeDoEspaco.PONTO_PARTIDA.toString());
        Tabuleiro.espacos[1] = new Lote(NomeDoEspaco.AV_SUMARE.toString(), "Marrom", 60, 50, 2, 10);
        Tabuleiro.espacos[2] = new EspacoDeCarta(NomeDoEspaco.COFRE.toString());
        Tabuleiro.espacos[3] = new Lote(NomeDoEspaco.PRACA_SE.toString(), "Marrom", 60, 50, 4, 20);
        Tabuleiro.espacos[4] = new ImpostoDeRenda(NomeDoEspaco.IMPOSTO.toString());
        Tabuleiro.espacos[5] = new EstacaoDeMetro(NomeDoEspaco.METRO_MARACANA.toString());
        Tabuleiro.espacos[6] = new Lote(NomeDoEspaco.RUA_25_MARCO.toString(), "Azul claro", 100, 50, 6, 30);
        Tabuleiro.espacos[7] = new EspacoDeCarta(NomeDoEspaco.SORTE.toString());
        Tabuleiro.espacos[8] = new Lote(NomeDoEspaco.AV_SAO_JOAO.toString(), "Azul claro", 100, 50, 6, 30);
        Tabuleiro.espacos[9] = new Lote(NomeDoEspaco.AV_PAULISTA.toString(), "Azul claro", 120, 50, 8, 40);
        Tabuleiro.espacos[10] = new Cadeia(NomeDoEspaco.CADEIA.toString());
        Tabuleiro.espacos[11] = new Lote(NomeDoEspaco.AV_VIEIRA_SOUTO.toString(), "Rosa", 140, 100, 10, 50);
        Tabuleiro.espacos[12] = new Utilidade(NomeDoEspaco.COMP_ELETRICA.toString());
        Tabuleiro.espacos[13] = new Lote(NomeDoEspaco.NITEROI.toString(), "Rosa", 140, 100, 10, 50);
        Tabuleiro.espacos[14] = new Lote(NomeDoEspaco.AV_ATLANTICA.toString(), "Rosa", 160, 100, 12, 60);
        Tabuleiro.espacos[15] = new EstacaoDeMetro(NomeDoEspaco.METRO_CARIOCA.toString());
        Tabuleiro.espacos[16] = new Lote(NomeDoEspaco.AV_PRES_JUSCELINO.toString(), "Laranja", 180, 100, 14, 70);
        Tabuleiro.espacos[17] = new EspacoDeCarta(NomeDoEspaco.COFRE.toString());
        Tabuleiro.espacos[18] = new Lote(NomeDoEspaco.AV_ENG_LUIS.toString(), "Laranja", 180, 100, 14, 70);
        Tabuleiro.espacos[19] = new Lote(NomeDoEspaco.AV_BRIGADEIRO.toString(), "Laranja", 200, 100, 16, 80);
        Tabuleiro.espacos[20] = new EstacionamentoGratis(NomeDoEspaco.ESTACIONAMENTO.toString());
        Tabuleiro.espacos[21] = new Lote(NomeDoEspaco.IPANEMA.toString(), "Vermelho", 220, 150, 18, 90);
        Tabuleiro.espacos[22] = new EspacoDeCarta(NomeDoEspaco.SORTE.toString());
        Tabuleiro.espacos[23] = new Lote(NomeDoEspaco.LEBLON.toString(), "Vermelho", 220, 150, 18, 90);
        Tabuleiro.espacos[24] = new Lote(NomeDoEspaco.COPACABANA.toString(), "Vermelho", 240, 150, 20, 100);
        Tabuleiro.espacos[25] = new EstacaoDeMetro(NomeDoEspaco.METRO_CONSOLACAO.toString());
        Tabuleiro.espacos[26] = new Lote(NomeDoEspaco.IBIRAPUERA.toString(), "Amarelo", 260, 150, 22, 110);
        Tabuleiro.espacos[27] = new Lote(NomeDoEspaco.IBIRAPUERA.toString(), "Amarelo", 260, 150, 22, 110);
        Tabuleiro.espacos[28] = new Utilidade(NomeDoEspaco.COMP_AGUA.toString());
        Tabuleiro.espacos[29] = new Lote(NomeDoEspaco.IBIRAPUERA.toString(), "Amarelo", 280, 150, 24, 120);
        Tabuleiro.espacos[30] = new VaParaCadeia(NomeDoEspaco.VA_PARA_CADEIA.toString());
        Tabuleiro.espacos[31] = new Lote(NomeDoEspaco.BARRA_DA_TIJUCA.toString(), "Verde", 300, 200, 24, 120);
        Tabuleiro.espacos[32] = new Lote(NomeDoEspaco.JARDIM_BOTANICO.toString(), "Verde", 300, 200, 26, 130);
        Tabuleiro.espacos[33] = new EspacoDeCarta(NomeDoEspaco.COFRE.toString());
        Tabuleiro.espacos[34] = new Lote(NomeDoEspaco.LAGOA_RODRIGO.toString(), "Verde", 320, 200, 28, 150);
        Tabuleiro.espacos[35] = new EstacaoDeMetro(NomeDoEspaco.METRO_REPUBLICA.toString());
        Tabuleiro.espacos[36] = new EspacoDeCarta(NomeDoEspaco.SORTE.toString());
        Tabuleiro.espacos[37] = new Lote(NomeDoEspaco.AV_MORUMBI.toString(), "Azul", 350, 200, 35, 175);
        Tabuleiro.espacos[38] = new TaxaDeRiqueza(NomeDoEspaco.TAXA_RIQUEZA.toString());
        Tabuleiro.espacos[39] = new Lote(NomeDoEspaco.RUA_OSCAR_FREIRE.toString(), "Azul", 400, 200, 50, 200);
    }

}
