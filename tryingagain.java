package tryingagain;

import java.util.Scanner;

//import tryingagain.Fruit.Orange;

public class tryingagain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		Fruit fruit = new Fruit(10, "banana", "light");
		Fruit.Orange orange = fruit.new Orange();
		orange.printing("orange");
		while (true) {
			str = s.nextLine().trim();
			System.out.println(str);
		}
	}

}
