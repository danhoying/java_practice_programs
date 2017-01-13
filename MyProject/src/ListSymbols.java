import static java.lang.System.out;

public class ListSymbols {
	enum Symbol {
		cherry, lemon, komquat, rutabaga
	}
	
	public static void main(String args[]) {
		for (Symbol leftReel : Symbol.values()) {
			for (Symbol middleReel : Symbol.values()) {
				for (Symbol rightReel : Symbol.values()) {
					out.print(leftReel);
					out.print(" ");
					out.print(middleReel);
					out.print(" ");
					out.println(rightReel);
				}
			}
			
		}
	}
}
