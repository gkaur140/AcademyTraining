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
		System.out.println("Total food cost is = " + calculate.totalFoodCost());
		scanner.close();
	}
}
