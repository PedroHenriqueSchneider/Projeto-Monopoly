package gerenciador;

import java.util.Random;
/*
* @author: Pedro Henrique Bianco Schneider
*/
public class Dado {
    private int valorDado;
    public void rolar(){
        Random r = new Random();
        this.valorDado = r.nextInt(6) + 1;
    }
    public int getValorDado(){
        return this.valorDado;
    }
    
}
