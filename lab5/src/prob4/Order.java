package prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;

    Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}

	public void addItem(String name){
		items.add(CustOrderFactory.createItem(name));
	}

	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
