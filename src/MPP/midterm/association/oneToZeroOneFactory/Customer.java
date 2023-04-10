package MPP.midterm.association.oneToZeroOneFactory;

public class Customer {
    String name;
    ShoppingCart cart;
    public Customer(String name){
        this.name = name;
    }
    public void setCart(ShoppingCart cart){
        this.cart = cart;
    }
}
