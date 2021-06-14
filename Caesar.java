package practice.kunsan.taewan;

import java.util.Scanner;

public class Caesar {
	void password() {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String output = "";

		System.out.print("원문 : ");
		input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {

			int asci = (int) input.charAt(i);

			if (65 <= asci && asci <= 90) {
				output += (char) (asci + 3);
			} else if (97 <= asci && asci <= 122) {
				output += (char) (asci + 3);
			} else {
				output += (char) asci;
			}
		}

		System.out.print("암호 : " + output);
	}

	public static void main(String[] args) {
		Caesar function = new Caesar();
		function.password();
	}
}
