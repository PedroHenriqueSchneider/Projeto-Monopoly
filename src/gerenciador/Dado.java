package gerenciador;

import java.util.Random;
/*
* @author: Pedro Henrique Bianco Schneider
*/
public class Dado {
    public int rolar(){
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
