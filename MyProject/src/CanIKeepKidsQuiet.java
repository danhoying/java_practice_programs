
public class CanIKeepKidsQuiet {

	public static void main(String[] args) {
		int gumballs;
		int kids;
		int gumballsPerKid;
		boolean eachKidGetsTen;
		
		gumballs = 140;
		kids = 15;
		gumballsPerKid = gumballs / kids;
		
		System.out.print("True or False? ");
		System.out.println("Each kids gets 10 gumballs.");
		eachKidGetsTen = gumballsPerKid >= 10;
		System.out.println(eachKidGetsTen);

	}

}
