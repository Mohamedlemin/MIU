package MPP.midterm.association.oneToZeroOneFactory;

public class ShoppingCart {
    private ShoppingCart(Customer customer){
        customer.setCart(this);
    }

    public static ShoppingCart addNewCart(Customer customer){
        if (customer == null) throw new NullPointerException();
        return new ShoppingCart(customer);
    }
}
