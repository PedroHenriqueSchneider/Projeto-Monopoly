package gerenciador;

import java.util.Random;

public class Dado {
    public int rolar(){
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
