package invoiceTest;

public class InvoiceTest {

	private String partNumber, partDescription;

	public String getPartDescription() {// getter for patDescription
		return partDescription;
	}

	public void setPartDescription(String partDescription) {// setter for partDescription
		this.partDescription = partDescription;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private double price, amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	InvoiceTest(String partnum, String partDes, int quan, double price) {// constructor
		partNumber = partnum;
		partDescription = partDes;
		quantity = quan;
		this.price = price;
	}

	public double getInvoiceAmount() {// calculating the total invoice
		if (quantity < 0)
			quantity = 0;
		if (price < 0.0)
			price = 0.0;
		amount = quantity * price;

		return amount;
	}

}
