package restaurantFoodCostApplication;

public class Coupon  {
	Coupon()
	{	}
Calculate calculate1=new Calculate();
	public double calculateDiscount(String coupon1,double foodCost) {
		double discount=0.0;
		if (coupon1.equalsIgnoreCase("Coupon5"))
			discount = 0.05 * foodCost;
		else if (coupon1.equalsIgnoreCase("Coupon10"))
			discount = 0.10 * foodCost;
		else if (coupon1.equalsIgnoreCase("Coupon$10"))
			discount = 10;
		else if (coupon1.equalsIgnoreCase("FreeDel"))
			discount = calculate1.deliveryfee;
		else
			System.out.println("Not Valid Coupon");
		return discount;
	}
}
