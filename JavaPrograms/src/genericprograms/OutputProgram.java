package genericprograms;

public class OutputProgram {

		public static void main(String args[]) {
			int x, y = 1;
			x = 10;
			if (x != 10 && x / 0 == 0)
				System.out.println(y);
			else
				System.out.println(++y);
		}
}
