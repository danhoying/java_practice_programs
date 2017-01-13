import java.util.Random;
import static java.lang.System.out;

public class SimpleDiceGame {

	public static void main(String[] args) {
		Random myRandom = new Random();
		int die1 = 0, die2 = 0;
		
		while (die1 + die2 != 7 && die1 + die2 != 11) {
			die1 = myRandom.nextInt(6) + 1;
			die2 = myRandom.nextInt(6) + 1;
		}
		out.println("Die 1: " + die1);
		out.println("Die 2: " + die2);
		out.println();
		
		out.print("Rolled ");
		out.println(die1 + die2);
	}

}
