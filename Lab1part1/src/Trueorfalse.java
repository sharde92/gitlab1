
import java.util.Scanner;

public class Trueorfalse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number1, number2;
		int digitTotal = -1;

		boolean validNumber = false;
		while (!validNumber) {
			System.out.print("Enter first number : ");
			number1 = sc.nextLine();
			System.out.print("Enter second number");
			number2 = sc.nextLine();

			if (number1.length() == number2.length()) {
				;
				try {
					int num1 = Integer.parseInt(number1);
					int num2 = Integer.parseInt(number2);

					if (num1 < 0 || num2 < 0) {
						System.out.println("Please enter positive number");
					} else {
						boolean validNumbers = true;
						for (int i = 0; i < number1.length(); i++) {
					int digit1 = Integer.parseInt(number1.charAt(i) + "");
							int digit2 = Integer.parseInt(number2.charAt(i) + "");
							System.out.println("Sum of digit at" + (i + 1) + "position:" + (digit1 + digit2));
							if (digitTotal < 0) {
								digitTotal = digit1 + digit2;
							} else if (digitTotal != digit1 + digit2) {
								validNumbers = false;
							}

						}
						if (validNumbers) {
							System.out
									.println(" Sum of digit at position are the same, return result is: " + validNumbers);
						} else {
							System.out.println(
									"Sum of digit at position are not the same, return result is:" + validNumbers);
						}
						validNumber = true;
					}

				} catch (Exception e) {
					System.out.println("Please enter number only");
				}
			} else {
				System.out.println("Please enter valid number");
			}
		}
		sc.close();
	}

}
