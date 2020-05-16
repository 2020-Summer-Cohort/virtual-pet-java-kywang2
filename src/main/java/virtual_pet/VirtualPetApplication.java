package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    static VirtualPet virtualPet = new VirtualPet();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, I am Larry the Lizard! This is how I feel:");
        showLevels();
        gameLoop();
    }

    public static void whatActivity() {
           System.out.println("What do you want to do?");
           System.out.println("1. Feed Larry Food.");
           System.out.println("2. Give Larry Water.");
           System.out.println("3. Play With Larry.");
           System.out.println("4. Let Larry Sleep.");
           int myResponse = input.nextInt();
           input.nextLine();

           if (myResponse == 1) {
               System.out.println("You chose to feed Larry.");
               virtualPet.getFood();
           } else if (myResponse == 2) {
               System.out.println("You chose to give Larry water.");
               virtualPet.getWater();
           } else if (myResponse == 3) {
               System.out.println("You chose to play with Larry.");
               virtualPet.getPlay();
           } else if (myResponse == 4) {
               System.out.println("You chose to let Larry sleep.");
               virtualPet.getSleep();
           }
           showLevels();
           virtualPet.getTick();
       }

    public static void gameLoop() {
        while ((virtualPet.getDesireToEat() > 0 && virtualPet.getDesireToEat() < 60) && (virtualPet.getDesireToDrink() > 0 && virtualPet.getDesireToDrink() < 60) && (virtualPet.getDesireToPlay() > 0 && virtualPet.getDesireToPlay() < 60) && (virtualPet.getDesireToSleep() > 0 && virtualPet.getDesireToSleep() < 60)) {
            whatActivity();
        }
        gameOver();
    }

    public static void gameOver() {
        if (virtualPet.getDesireToEat() >= 60) {
            System.out.println("Larry is too hungry and ran away. You lose! Game Over");
        } else if (virtualPet.getDesireToDrink() >= 60) {
            System.out.println("Larry is too thirsty and ran away.  You lose! Game Over");
        } else if (virtualPet.getDesireToPlay() >= 60) {
            System.out.println("Larry is too bored and ran away.  You lose! Game Over");
        } else if (virtualPet.getDesireToSleep() >= 60) {
            System.out.println("Larry is too tired and ran away.  You lose! Game Over");
        }
    }

    public static void showLevels() {
        int hungerLevel = virtualPet.getDesireToEat();
        int thirstLevel = virtualPet.getDesireToDrink();
        int playLevel = virtualPet.getDesireToPlay();
        int sleepLevel = virtualPet.getDesireToSleep();
        System.out.println("Hunger: " + hungerLevel);
        System.out.println("Thirst: " + thirstLevel);
        System.out.println("Play: " + playLevel);
        System.out.println("Sleep: " + sleepLevel);
    }
}