import java.util.Scanner;
import static java.lang.System.out;

public class Counter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String reel1str = "0"; 
		String reel2str = "0";
		String reel3str = "0";

		while (true) {
			
			out.print(reel1str + " ");
			out.print(reel2str + " ");
			out.println(reel3str);
			out.println();
			
			out.print("Enter value: ");
				
			reel1str = keyboard.findWithinHorizon(".", 0);
			reel2str = keyboard.findWithinHorizon(".", 1);
			reel3str = keyboard.findWithinHorizon(".", 2);
			
			int reel1 = Integer.parseInt(reel1str);
			int reel2 = Integer.parseInt(reel2str);
			int reel3 = Integer.parseInt(reel3str);
			
			if (reel1 == 9 && reel2 == 9 && reel3 == 9) {
				break;
			}
				
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
