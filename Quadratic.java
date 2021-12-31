package bridglabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Calculating Quadratic Roots of Equation");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of 'a' in Qudratic equation:");
		int a = scanner.nextInt();
		System.out.println("Enter the value of 'b' in Qudratic equation:");
		int b = scanner.nextInt();
		System.out.println("Enter the value of 'c' in Qudratic equation:");
		int c = scanner.nextInt();
		System.out.println("The roots of the equation " + a + "x^2+" + b + "x+" + c + " are ");
		scanner.close();
		int Delta = b * b - 4 * a * c;
		System.out.println(Delta);
			float Root1 = (float) (-b + Math.sqrt(Delta)) / (2 * a);
			float Root2 = (float) (-b - Math.sqrt(Delta)) / (2 * a);
			System.out.println("Root 1: " + Root1 + "  &  Root 2: " + Root2);
	}

	}

