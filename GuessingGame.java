import java.util.Random;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
public class GuessingGame {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green"};
        Random random = new Random();
        String answer = colors[random.nextInt(colors.length)];

        Scanner scanner = new Scanner(System.in);
        String guess;

        do {
            System.out.println("Guess the color (red, blue, or green):");
            guess = scanner.nextLine();

            if (guess.equalsIgnoreCase(answer)) {
                System.out.println("Congratulations! You are a winner! Now here is your prize!");
                openBrowser("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
                break;
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        } while (true);
    }

    private static void openBrowser(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
        