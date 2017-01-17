import java.util.Random;
import java.text.NumberFormat;
import static java.lang.System.out;

public class ProcessAccounts {

	public static void main(String[] args) {
		
		Random myRandom = new Random();
		Account anAccount = new Account();
		
		for (int i = 0; i < 3; i++) {
			anAccount.lastName = "" +
					(char) (myRandom.nextInt(26) + 'A') +
					(char) (myRandom.nextInt(26) + 'a') +
					(char) (myRandom.nextInt(26) + 'a');
			
			anAccount.id = myRandom.nextInt(10000);
			anAccount.balance = myRandom.nextInt(10000);
			anAccount.display();
		}
	}
}

class Account {
	String lastName;
	int id;
	double balance;
	
	void display() {
		NumberFormat currency =
				NumberFormat.getCurrencyInstance();
		
		out.print("The account with last name ");
		out.print(lastName);
		out.print(" and ID number ");
		out.print(id);
		out.print(" has balance ");
		out.println(currency.format(balance));
	}
}
