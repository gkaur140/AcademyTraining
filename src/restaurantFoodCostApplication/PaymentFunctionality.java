package restaurantFoodCostApplication;

import java.util.HashMap;

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
	public boolean cardPayment(String cardNum, int pin) {

		HashMap<String, Integer> cardInfo = new HashMap<String, Integer>();
		cardInfo.put("1234534674589506", 1234);
		cardInfo.put("3457638906367849", 2345);
		cardInfo.put("8878767589645677", 6789);
		cardInfo.put("4573890246835903", 3457);
		cardInfo.put("4589236792068935", 3467);
		cardInfo.put("4579024567832678", 6783);
		cardInfo.put("4589031658667890", 3489);
		cardInfo.put("6790432167895437", 3490);
		cardInfo.put("7890543267895438", 3498);
		cardInfo.put("6789054326789054", 2690);
		if (pin == 0) {
			return (cardInfo.containsKey(cardNum));
		} else {
			return (cardInfo.containsValue(pin));
		}

	}
}
