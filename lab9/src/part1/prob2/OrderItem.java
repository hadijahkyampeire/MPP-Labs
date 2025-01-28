package part1.prob2;

public class OrderItem {
	private String productId;
	private int quantityRequested;
	private int unitPrice;
	//package level constructor
	OrderItem(String id, int quantity, int price) {
		this.productId = id;
		this.quantityRequested = quantity;
		this.unitPrice = price;
	}
	@Override
	public String toString() {
		return "   " + productId + ": " + quantityRequested + ", " + unitPrice;
	}
	
}
