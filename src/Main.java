import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // random number under 0 and 10
        int random = (int) (Math.random() * 10);
        int guess = 10;
        int attempts = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 0 et 10");

        while (guess != random) {
            if (attempts == 3) {
                System.out.println("Vous avez atteint le nombre maximum d'essais");
                break;
            }
            System.out.print("Entrez un nombre: ");
            guess = input.nextInt();

            if (guess == random) {
                System.out.println("Bravo ! Le nombre était " + random);
                System.out.println("Vous avez trouvé en " + attempts + " essais");
                input.close();
            } else if (guess > random) {
                System.out.println("Le nombre est plus petit");
                attempts++;
            } else {
                System.out.println("Le nombre est plus grand");
                attempts++;
            }
        }
    }
}