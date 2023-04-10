package MPP.midterm.association.oneToZeroOneFactory.bidr;

public class CustShopCartFactory {
    public static Customer createCustomer(String name){
        if(name == null) throw  new NullPointerException();
        Customer customer = new Customer(name);
        Cart cart = new Cart(customer);
        customer.setCart(cart);
        return customer;
    }
}
