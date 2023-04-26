package MPP.Week3.lab9.prob8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
	static List<OrderItem> orderItems = new ArrayList<>();

	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
//		System.out.println("Do any of these Order Items have an order of flowers? " +
//				m.findProduct("Flowers"));
		m.printProductsNameStartWithT(orderItems);
	}

	private void printProductsNameStartWithT(List<OrderItem> list ){
//		Stream<String> stringStream = list.stream()
//				.map(O -> O.getProduct().getProductName())
//				.filter(s -> s.startsWith("T"))
//				.map(String::toUpperCase);
//		stringStream.forEach(System.out::println);
		list.stream()
				.peek(orderItem -> {
					if (orderItem.getProduct().getProductName().endsWith("s")){
						orderItem.getProduct().setProductName(orderItem.getProduct().getProductName().toUpperCase());
					}
				})
				.forEach(System.out::println);
	}

	private boolean findProduct(String prodName) {
		for(OrderItem order : orderItems){
			if (Optional.ofNullable(order)
					.map(OrderItem::getProduct)
					.map(Product::getProductName)
					.orElse("").equals(prodName)
			)
				return true;
		}
		return false;

	}

	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rods", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Gos",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "fs", 221.00), 5));
	}
}
