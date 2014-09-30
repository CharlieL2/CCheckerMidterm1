package checker;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckDigit {

	public static boolean Check() {

		Scanner next = new Scanner(System.in);
		System.out.println("Input card number: ");
		String input = next.next();

		ArrayList<Integer> digits = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			digits.add(Integer.valueOf(c - '0'));

		}
		int[] cardNumber = new int[digits.size()];
		for (int i = 0; i < cardNumber.length; i++) {
			cardNumber[i] = Integer.valueOf(digits.get(i));
		}
		 int sum = 0;
	     int length = cardNumber.length;
	     
	     for (int i = 0; i < length; i++) {

	       int digit = cardNumber[length - i - 1];

	       if (i % 2 == 1) {
	           digit *= 2;
	       }
	       sum += digit > 9 ? digit - 9 : digit;
	     }
	     return sum % 10 == 0;
	}
	
	public static boolean Check(String Cnumber) {

		String input = Cnumber;

		ArrayList<Integer> digits = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			digits.add(Integer.valueOf(c - '0'));

		}
		int[] cardNumber = new int[digits.size()];
		for (int i = 0; i < cardNumber.length; i++) {
			cardNumber[i] = Integer.valueOf(digits.get(i));
		}
		 int sum = 0;
	     int length = cardNumber.length;
	     
	     for (int i = 0; i < length; i++) {

	       int digit = cardNumber[length - i - 1];

	       if (i % 2 == 1) {
	           digit *= 2;
	       }
	       sum += digit > 9 ? digit - 9 : digit;
	     }
	     return sum % 10 == 0;
	}
}

