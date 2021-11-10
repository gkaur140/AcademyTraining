package restaurantFoodCostApplication;

public class Calculate {
	double foodCost, distance, tip, tax, totalFoodCost;
	static double discount,deliveryfee;// declared as static because we are using in two classes
	String coupon;

	Calculate() {

	}

	Calculate(double f, double d, String c) {
		this.foodCost = f;
		this.distance = d;
		this.coupon = c;
	}

	public double calculateFees() {
		if (foodCost >= 100) {
			if (distance <= 20) {
				deliveryfee = 0;
			} else {
				if (foodCost * 0.02 < 2)
					deliveryfee = (distance - 20) * (foodCost * 0.02);
				else
					deliveryfee = (distance - 20) * 2;
			}
		} else if (foodCost > 50 && foodCost < 100) {
			if (distance <= 10) {
				deliveryfee = foodCost * 0.05;
			} else {
				if (foodCost * 0.02 < 2) {
					deliveryfee = (distance - 10) * (foodCost * 0.02);

				} else {
					deliveryfee = (distance - 10) * 2;
				}
				deliveryfee = deliveryfee + (10 * (foodCost * 0.05));
			}
		} else if (foodCost < 50) {
			if (distance <= 5)
				deliveryfee = foodCost * 0.10;
			else {
				if (foodCost * 0.02 < 2)
					deliveryfee = (distance - 5) * (foodCost * 0.02);
				else {
					deliveryfee = (distance - 5) * 2;
				}
				deliveryfee = deliveryfee + (5 * (foodCost * 0.10));
			}
		}

		return deliveryfee;
	}

	public double calculateTip() {
		if (foodCost > 40)
			tip = 0.02 * foodCost;
		return tip;
	}

	public double calculateTax() {
		tax = foodCost * 0.13;
		return tax;
	}

	public double totalFoodCost() {

		totalFoodCost = (foodCost - discount) + deliveryfee + tax + tip;
		return totalFoodCost;

	}
}
