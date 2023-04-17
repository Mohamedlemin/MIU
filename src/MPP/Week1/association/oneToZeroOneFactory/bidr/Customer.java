package MPP.Week1.association.oneToZeroOneFactory.bidr;

public class Customer {
    String name;
    Cart cart;

    public Customer(String name){
        this.name  = name;
    }
    public void setCart(Cart cart){
        this.cart = cart;
    }
}
