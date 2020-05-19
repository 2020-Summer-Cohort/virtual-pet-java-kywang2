package virtual_pet;

import java.util.Random;

public class VirtualPet {

    Random rand = new Random();

    private int desireToEat = rand.nextInt(21) + 30;
    private int desireToDrink = rand.nextInt(21) + 30;
    private int desireToPlay = rand.nextInt(21) + 30;
    private int desireToSleep = rand.nextInt(21) + 30;

    void food() {
        desireToEat = desireToEat - 2;
    }

    int getDesireToEat() {
        return desireToEat;
    }

    void water() {
        desireToDrink = desireToDrink - 2;}

    int getDesireToDrink() {
        return desireToDrink;
    }

    void play() {
        desireToPlay = desireToPlay - 2;
    }

    int getDesireToPlay() {
        return desireToPlay;
    }

    void sleep() {
        desireToSleep = desireToSleep - 2;
    }

    int getDesireToSleep() {
        return desireToSleep;
    }

    void tick() {
        desireToEat = desireToEat + 1;
        desireToDrink = desireToDrink + 1;
        desireToPlay = desireToPlay + 1;
        desireToSleep = desireToSleep + 1;
    }
}



