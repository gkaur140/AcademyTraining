package restaurantFoodCostApplication;

public interface paymentInterface {

	public void cashPayment(double money, double totalFoodCost);

	public boolean cardPayment(String cardNum, int pin);

}
