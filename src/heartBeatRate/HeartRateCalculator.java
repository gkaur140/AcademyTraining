package heartBeatRate;

public class HeartRateCalculator {

	int age, max;
	String range;
HeartRateCalculator(int age1){
	age= age1;// Storing age value to a class variable through constructor 
}
	public int calculate() {
		max = 220 - age;// calculating maximum heart beat value
		return max;
	}

	public String targetHeartBeatCalculator() {
		double max1 = max * 0.85;
		double min = max * 0.50;
		range = max1 + " and " + min;// storing maximum and minimum heart beat value of person in a string to show as an out put value
		return range;
	}
}
