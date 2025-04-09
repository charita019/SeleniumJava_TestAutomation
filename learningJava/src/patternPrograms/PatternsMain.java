package patternPrograms;

import java.util.Scanner;

public class PatternsMain {

	public static void main(String[] args) {

		StarPatterns s = new StarPatterns();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = scanner.nextInt();
		scanner.close();

		/*System.out.println("**** STAR PATTERN 1 ****");
		s.starPattern1(rows);

		System.out.println();

		System.out.println("**** STAR PATTERN 2 ****");
		s.starPattern2(rows);

		System.out.println();

		System.out.println("**** STAR PATTERN 3 ****");
		s.starPattern3(rows);
		
		System.out.println();*/

		System.out.println("**** STAR PATTERN 4 ****");
		s.starPattern4(rows);
		
		System.out.println("**** STAR PATTERN 4 With While Loop ****");
		s.starPattern4UsingWhile(rows);
	}
}
