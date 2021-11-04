package banquetHallAssignment;

public class Banquet {
	double x,y,cess;
	
	public double calculateBaseCost(double a, double b, double c) 
	{
		x = (a+b+c);
		return x;
	}
	
	public double calculateTax()
	{
	y = (x*(0.13));	
	return y;
	}
	
	public double calculateCess(int guest) {
		
		 double base = x;
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
		System.out.println("Bill is = "+ (x+y+cess));
		
	}
	}


