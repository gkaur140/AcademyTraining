package restaurantFoodCostApplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter food cost and distance and coupon please");
		double foodCost = scanner.nextDouble();
		double distance = scanner.nextDouble();
		String coupon1 = scanner.next();
		Calculate calculate = new Calculate(foodCost, distance, coupon1);
		calculate.calculateFees();
		calculate.calculateTax();
		calculate.calculateTip();
		Coupon coupon = new Coupon(foodCost, coupon1);
		coupon.calculateDiscount();
		calculate.totalFoodCost();
		System.out.println(calculate.calculateFees());
		System.out.println(calculate.calculateTax());
		System.out.println(calculate.calculateTip());
		System.out.println(coupon.calculateDiscount());
		System.out.println("Total food cost is = " + calculate.totalFoodCost);
		scanner.close();
	}
}
