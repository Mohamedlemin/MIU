package MPP.midterm.association.oneToZeroOneFactory.bidr;

import MPP.midterm.association.oneToZeroOneFactory.ShoppingCart;

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
