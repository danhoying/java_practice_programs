import java.util.Scanner;
import static java.lang.System.out;

public class Counter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int reel1 = 0; 
		int reel2 = 0;
		int reel3 = 0;

		while (reel1 < 20) {
			
			out.print(reel1 + " ");
			out.print(reel2 + " ");
			out.println(reel3);
			out.println();
			
			out.print("Enter value: ");
				
			reel1 = keyboard.nextInt();
			reel2 = keyboard.nextInt();
			reel3 = keyboard.nextInt();
				
			out.print(reel1 + " ");
			out.print(reel2 + " ");
			out.println(reel3);
			out.println();
			out.println("-----------------------");
			
			reel1 += 1;
			reel2 += 1;
			reel3 += 1;
			
			if (reel1 == 10) {
				out.println("~~~~~~~~~~~~~~~~~~~");
				out.println("BET ON 1!");
				out.println("~~~~~~~~~~~~~~~~~~~");
				out.println();
				reel1 = 0;
			}
			
			if (reel2 == 7) {
				out.println("~~~~~~~~~~~~~~~~~~~");
				out.println("BET ON 2!");
				out.println("~~~~~~~~~~~~~~~~~~~");
				out.println();
				reel2 = 0;
			} 
			
			if (reel3 == 5) {
				out.println("~~~~~~~~~~~~~~~~~~~");
				out.println("BET ON 3!");
				out.println("~~~~~~~~~~~~~~~~~~~");
				out.println();
				reel3 = 0;
			}
		}
		keyboard.close();
	}

}
