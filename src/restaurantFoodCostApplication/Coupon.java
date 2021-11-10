package restaurantFoodCostApplication;

public class Coupon extends Calculate {
	double foodCost;
	String coupon;

	Coupon(double f, String c) {
		this.foodCost = f;
		this.coupon = c;
	}

	public double calculateDiscount() {
		if (coupon.equalsIgnoreCase("Coupon5"))
			discount = 0.05 * foodCost;
		else if (coupon.equalsIgnoreCase("Coupon10"))
			discount = 0.10 * foodCost;
		else if (coupon.equalsIgnoreCase("Coupon$10"))
			discount = 10;
		else if (coupon.equalsIgnoreCase("FreeDel"))
			discount = deliveryfee;
		return discount;
	}

}
