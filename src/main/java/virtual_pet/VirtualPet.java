package virtual_pet;

import java.util.Random;

public class VirtualPet {

    Random rand = new Random();

    private int desireToEat = rand.nextInt(21)+30;
    private int desireToDrink = rand.nextInt(21)+30;
    private int desireToPlay = rand.nextInt(21)+30;
    private int desireToSleep = rand.nextInt(21)+30;

    void getFood() {
        desireToEat = desireToEat - 2;
    }

    int getDesireToEat() {
        return desireToEat;
    }

    void getWater() {
        desireToDrink = desireToDrink - 2;
    }

    int getDesireToDrink() {
        return desireToDrink;
    }

    void getPlay() {
        desireToPlay = desireToPlay - 2;
    }

    int getDesireToPlay() {
        return desireToPlay;
    }

    void getSleep() {
        desireToSleep = desireToSleep - 2;
    }

    int getDesireToSleep() {
        return desireToSleep;
    }

    void getTick() {
        desireToEat = desireToEat + 1;
        desireToDrink = desireToDrink + 1;
        desireToPlay = desireToPlay + 1;
        desireToSleep = desireToSleep + 1;
    }
}



