  //Daniel xavier
  //Ra: 18.00022-3
  

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    
    }


}