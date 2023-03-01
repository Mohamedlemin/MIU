package FPP.Lesson2.lab2.assigment_1;

public class Main {
    public static void main(String[] args) {
        Address billingAddress1 = new Address("123 Main St", "Chicago", "IL", "60601");
        Address shippingAddress1 = new Address("456 Oak Ave", "New York", "NY", "10001");
        Customer customer1 = new Customer("Alice", "Smith", "111-22-3333", billingAddress1, shippingAddress1);

        Address billingAddress2 = new Address("789 Maple Rd", "Los Angeles", "CA", "90001");
        Address shippingAddress2 = new Address("1010 Pine St", "San Francisco", "CA", "94101");
        Customer customer2 = new Customer("Bob", "Johnson", "444-55-6666", billingAddress2, shippingAddress2);

        Address billingAddress3 = new Address("321 Elm St", "Chicago", "IL", "60601");
        Address shippingAddress3 = new Address("654 Pine Ave", "Miami", "FL", "33101");
        Customer customer3 = new Customer("Charlie", "Brown", "777-88-9999", billingAddress3, shippingAddress3);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
