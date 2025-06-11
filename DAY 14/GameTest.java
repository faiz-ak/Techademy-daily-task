// Create an interface Playable with a method play(). Implement it in classes Football, Cricket, and Tennis. Write a program to call play() on each object.
import java.util.Scanner;

interface Playable {
    void play();
}


class Football implements Playable {
    public void play() {
        System.out.println("Playing Football: 11 players per team.");
    }
}

class Cricket implements Playable {
    public void play() {
        System.out.println("Playing Cricket: 11 players per side.");
    }
}

class Tennis implements Playable {
    public void play() {
        System.out.println("Playing Tennis: Singles or Doubles.");
    }
}

public class GameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose which game to play (Football for 1 / Cricket for 2 / Tennis for 3): ");
        int choice = sc.nextInt();

        Playable game;

        if (choice == 1) {
            game = new Football();
        } else if (choice == 2) {
            game = new Cricket();
        } else if (choice == 3) {
            game = new Tennis();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        game.play();
    }
}
