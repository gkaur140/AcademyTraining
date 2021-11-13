package restaurantFoodCostApplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter food cost please");
		double foodCost = scanner.nextDouble();
		System.out.println("Enter distance please");
		double distance = scanner.nextDouble();
		System.out.println("Enter coupon please");
		String coupon1 = scanner.next();
		Calculate calculate = new Calculate(foodCost, distance, coupon1);
		double totalFoodCost = calculate.totalFoodCost();
		System.out.println("Total food cost is = " + totalFoodCost);
		System.out.println("How would you like to pay : Cash or Card ?");
		String type = scanner.next();// type is storing type of payment
		PaymentFunctionality paymentFunctionality = new PaymentFunctionality();
		if (type.equalsIgnoreCase("cash")) {
			System.out.println("Please enter the Cash amount");
			double money = scanner.nextDouble();
			paymentFunctionality.cashPayment(money, totalFoodCost);
		} else {
			System.out.println("Please enter last 4 digits of card and pin number");
			int cardNum = scanner.nextInt();
			int pin = scanner.nextInt();
			paymentFunctionality.cardPayment(cardNum, pin);
		}
		scanner.close();
	}
}
