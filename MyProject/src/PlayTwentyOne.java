import java.util.Random;
import static java.lang.System.out;

public class PlayTwentyOne {

	public static void main(String[] args) {
		Random myRandom = new Random();
		int card = 0, total = 0;
		out.println("Card\tTotal");
		
		while (total < 21) {
			card = myRandom.nextInt(10) + 1;
			total += card;
			out.println(card + "\t" + total);

			if (total == 21) {
				out.println("You win!");
			} else if (total > 21) {
				out.println("You lose.");
			}
		}
	}
}
