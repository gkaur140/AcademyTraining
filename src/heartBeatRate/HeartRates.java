package heartBeatRate;

import java.util.Scanner;

public class HeartRates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String firstName, lastName;
		
		System.out.println("Please Enter your First name , Last name and age in years");
		firstName = scanner.next();
		lastName = scanner.next();
		int age = scanner.nextInt();
		HeartRateCalculator heartRateCalculator = new HeartRateCalculator(age);// passing age value to constructor
		System.out.println("First and last name is " + firstName + " " + lastName);
		System.out.println("Age is " + age);
		heartRateCalculator.calculate();// calculating maximum heart beat
		heartRateCalculator.targetHeartBeatCalculator();// calculating range of heart beat

		System.out.println("Maximum heartrate is " + heartRateCalculator.max);// fetching maximum heart beat value from another class through object
		System.out.println("Range of  heartrate maximum and minimum is " + heartRateCalculator.range);// fetching range of heart beat through object

		scanner.close();

	}
}
