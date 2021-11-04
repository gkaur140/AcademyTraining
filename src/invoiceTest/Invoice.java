package invoiceTest;

import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String partNumber, partDescription;
		int quantity;
		double price;
		System.out.println("Enter Part number , Part description , quantity and price");
		partNumber = scanner.next();
		partDescription = scanner.next();
		quantity = scanner.nextInt();
		price = scanner.nextDouble();
		InvoiceTest invoiceTest1 = new InvoiceTest(partNumber, partDescription, quantity, price);
		invoiceTest1.getInvoiceAmount();
		System.out.println("Part Number is = " + partNumber);
		System.out.println("Part Description is = " + partDescription);
		System.out.println("Part Quantity is = " + quantity);
		System.out.println("Part price is = " + price);
		System.out.println("Total Amount for part is = " + invoiceTest1.getAmount());//using getter of amount variable to fetch amount of invoice 
		scanner.close();
	}
}
