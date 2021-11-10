package banquetHallAssignment;

public class Banquet {
	double totalBaseCost,tax,cess;
	
	public double calculateBaseCost(double baseCost, double foodCost, double tip) 
	{
		totalBaseCost = (baseCost+foodCost+tip);
		return totalBaseCost;
	}
	
	public double calculateTax()
	{
	tax = (totalBaseCost*(0.13));	
	return tax;
	}
	
	public double calculateCess(int guest) {
		
		 double base = totalBaseCost;
		if(guest<=40)
			cess = base*0.04;
		else if (guest>40&&guest<=80)
			cess = base*0.08;
		else if (guest>80&&guest<=150)
			cess = base*0.10;
		else 
			cess = base*0.125;
		return cess;
		
		
	}
	public void calculateTheTotalCost() {
		System.out.println("Bill is = "+ (totalBaseCost+tax+cess));
		
	}
	}


