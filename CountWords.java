import java.io.*;
import java.util.*;

public class CountWords {
	public static void main(String[] args)

	throws FileNotFoundException {
		Scanner input = new Scanner(new File("filler.txt"));

		int count = 0;

		while (input.hasNext()) {
			String word = input.next();
			count++;
		}
		System.out.println("Total words = " + count);
	}

}