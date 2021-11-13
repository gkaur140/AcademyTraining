package restaurantFoodCostApplication;

public class PaymentFunctionality implements paymentInterface {

	@Override
	public void cashPayment(double money, double totalFoodCost) {
		double change = money - totalFoodCost;
		if (change > 0) {
			System.out.println("Change due is = " + change);
		} else if (change < 0) {
			System.out.println("balance Due is = " + Math.abs(change));
		} else
			System.out.println("Total balance is = 0");

	}

	@Override
	public void cardPayment(int cardNum, int Pin) {
		if (pin == Pin) {
			System.out.println("Transaction went through card number ending with " + cardNum);
			System.out.println("Balance is = 0");
		} else {
			System.out.println("Transaction Declined");
		}

	}
}
