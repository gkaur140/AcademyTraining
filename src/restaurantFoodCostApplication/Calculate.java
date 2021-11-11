package restaurantFoodCostApplication;

public class Calculate {
	double foodCost, distance, tip, tax, totalFoodCost;
	double discount, deliveryfee,fee1,fee2;
	String coupon2;
	

	Calculate() {

	}

	Calculate(double foodCost, double distance, String coupon) {
		this.foodCost = foodCost;
		this.distance = distance;
		this.coupon2 = coupon;
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
				fee1=foodCost*0.02*(distance-10);
				fee2=2*(distance-10);
				if (fee1 < fee2 ) {
					deliveryfee = fee1;

				} 
				else {
					deliveryfee = fee2;
				}
				deliveryfee = deliveryfee + (10 * (foodCost * 0.05));
			}
		} else if (foodCost < 50) {
			if (distance <= 5)
				deliveryfee = foodCost * 0.10;
			else {
				fee1=foodCost*0.02*(distance-5);
				fee2=2*(distance-5);
				if (fee1<fee2)
					deliveryfee = fee1;
				else {
					deliveryfee = fee2;
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
		
		calculateTip();		
		calculateTax();
		calculateFees();
		Coupon couponClass = new Coupon();
		discount = couponClass.calculateDiscount(coupon2, foodCost);

		totalFoodCost = (foodCost - discount) + deliveryfee + tax + tip;
		return totalFoodCost;
		
	}
	
	
}
