package restaurantFoodCostApplication;

public interface paymentInterface {
	static int pin = 1234;

	public void cashPayment(double money, double totalFoodCost);

	public void cardPayment(int cardNum, int Pin);

}
