package banquetHallAssignment;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of guest , base cost , food cost and beverage cost and tip ");
		int noOfGuest = scanner.nextInt();
		double baseCost = scanner.nextDouble();
		double foodCost = scanner.nextDouble();
		double beverage = scanner.nextDouble();
		Banquet banquet = new Banquet();
		banquet.calculateBaseCost(foodCost, baseCost, beverage);
		banquet.calculateTax();
		banquet.calculateCess(noOfGuest);
		banquet.calculateTheTotalCost();
		scanner.close();

	}
}
