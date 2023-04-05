package MPP.Week1.Lab2.prob2;


import MPP.Week1.Lab2.prob2.Order;

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

