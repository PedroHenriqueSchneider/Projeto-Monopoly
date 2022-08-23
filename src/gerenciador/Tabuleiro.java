package gerenciador;

public class Tabuleiro {
    public Espaco[] espacos;
    private GrupoDoLote[] gruposLotes;
    private final int nEspacos = 40;
    public Tabuleiro() {
        
        // Espaços pré-definidos da tabela.
        this.espacos = new Espaco[nEspacos];
        this.gruposLotes = new GrupoDoLote[8];
        this.espacos[0] = new PontoDePartida(NomeDoEspaco.PONTO_PARTIDA.toString());
        this.espacos[1] = new Lote(NomeDoEspaco.AV_SUMARE.toString(), "Marrom", 60, 50, 2, 10);
        this.espacos[2] = new EspacoDeCarta(NomeDoEspaco.COFRE.toString());
        this.espacos[3] = new Lote(NomeDoEspaco.PRACA_SE.toString(), "Marrom", 60, 50, 4, 20);
        this.espacos[4] = new ImpostoDeRenda(NomeDoEspaco.IMPOSTO.toString());
        this.espacos[5] = new EstacaoDeMetro(NomeDoEspaco.METRO_MARACANA.toString());
        this.espacos[6] = new Lote(NomeDoEspaco.RUA_25_MARCO.toString(), "Azul claro", 100, 50, 6, 30);
        this.espacos[7] = new EspacoDeCarta(NomeDoEspaco.SORTE.toString());
        this.espacos[8] = new Lote(NomeDoEspaco.AV_SAO_JOAO.toString(), "Azul claro", 100, 50, 6, 30);
        this.espacos[9] = new Lote(NomeDoEspaco.AV_PAULISTA.toString(), "Azul claro", 120, 50, 8, 40);
        this.espacos[10] = new Cadeia(NomeDoEspaco.CADEIA.toString());
        this.espacos[11] = new Lote(NomeDoEspaco.AV_VIEIRA_SOUTO.toString(), "Rosa", 140, 100, 10, 50);
        this.espacos[12] = new Utilidade(NomeDoEspaco.COMP_ELETRICA.toString());
        this.espacos[13] = new Lote(NomeDoEspaco.NITEROI.toString(), "Rosa", 140, 100, 10, 50);
        this.espacos[14] = new Lote(NomeDoEspaco.AV_ATLANTICA.toString(), "Rosa", 160, 100, 12, 60);
        this.espacos[15] = new EstacaoDeMetro(NomeDoEspaco.METRO_CARIOCA.toString());
        this.espacos[16] = new Lote(NomeDoEspaco.AV_PRES_JUSCELINO.toString(), "Laranja", 180, 100, 14, 70);
        this.espacos[17] = new EspacoDeCarta(NomeDoEspaco.COFRE.toString());
        this.espacos[18] = new Lote(NomeDoEspaco.AV_ENG_LUIS.toString(), "Laranja", 180, 100, 14, 70);
        this.espacos[19] = new Lote(NomeDoEspaco.AV_BRIGADEIRO.toString(), "Laranja", 200, 100, 16, 80);
        this.espacos[20] = new EstacionamentoGratis(NomeDoEspaco.ESTACIONAMENTO.toString());
        this.espacos[21] = new Lote(NomeDoEspaco.IPANEMA.toString(), "Vermelho", 220, 150, 18, 90);
        this.espacos[22] = new EspacoDeCarta(NomeDoEspaco.SORTE.toString());
        this.espacos[23] = new Lote(NomeDoEspaco.LEBLON.toString(), "Vermelho", 220, 150, 18, 90);
        this.espacos[24] = new Lote(NomeDoEspaco.COPACABANA.toString(), "Vermelho", 240, 150, 20, 100);
        this.espacos[25] = new EstacaoDeMetro(NomeDoEspaco.METRO_CONSOLACAO.toString());
        this.espacos[26] = new Lote(NomeDoEspaco.IBIRAPUERA.toString(), "Amarelo", 260, 150, 22, 110);
        this.espacos[27] = new Lote(NomeDoEspaco.IBIRAPUERA.toString(), "Amarelo", 260, 150, 22, 110);
        this.espacos[28] = new Utilidade(NomeDoEspaco.COMP_AGUA.toString());
        this.espacos[29] = new Lote(NomeDoEspaco.IBIRAPUERA.toString(), "Amarelo", 280, 150, 24, 120);
        this.espacos[30] = new VaParaCadeia(NomeDoEspaco.VA_PARA_CADEIA.toString());
        this.espacos[31] = new Lote(NomeDoEspaco.BARRA_DA_TIJUCA.toString(), "Verde", 300, 200, 24, 120);
        this.espacos[32] = new Lote(NomeDoEspaco.JARDIM_BOTANICO.toString(), "Verde", 300, 200, 26, 130);
        this.espacos[33] = new EspacoDeCarta(NomeDoEspaco.COFRE.toString());
        this.espacos[34] = new Lote(NomeDoEspaco.LAGOA_RODRIGO.toString(), "Verde", 320, 200, 28, 150);
        this.espacos[35] = new EstacaoDeMetro(NomeDoEspaco.METRO_REPUBLICA.toString());
        this.espacos[36] = new EspacoDeCarta(NomeDoEspaco.SORTE.toString());
        this.espacos[37] = new Lote(NomeDoEspaco.AV_MORUMBI.toString(), "Azul", 350, 200, 35, 175);
        this.espacos[38] = new TaxaDeRiqueza(NomeDoEspaco.TAXA_RIQUEZA.toString());
        this.espacos[39] = new Lote(NomeDoEspaco.RUA_OSCAR_FREIRE.toString(), "Azul", 400, 200, 50, 200);
    }
    public int getEspacos(){
        return this.nEspacos;
    }
}
