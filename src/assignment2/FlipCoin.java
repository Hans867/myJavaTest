package assignment2;
import java.util.concurrent.ThreadLocalRandom;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {

        int min = 0;
        int max = 1;

        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return randomNum;
}
}

