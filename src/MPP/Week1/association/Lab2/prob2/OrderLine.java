package MPP.Week1.association.Lab2.prob2;


public class OrderLine {
    private Order order;

    public OrderLine(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

