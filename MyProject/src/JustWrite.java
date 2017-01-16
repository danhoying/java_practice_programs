import java.io.FileNotFoundException;
import java.io.PrintStream;

public class JustWrite {

	public static void main(String args[])
		throws FileNotFoundException {
		
		PrintStream diskWriter =
			new PrintStream("cookedData.txt");
		diskWriter.println(99.75);
		
		diskWriter.close();
	}

}
