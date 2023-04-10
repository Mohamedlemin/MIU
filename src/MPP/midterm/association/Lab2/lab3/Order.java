package MPP.midterm.association.Lab2.lab3;

import java.time.LocalDate;

public class Order {
    private String orderNum;
    private LocalDate orderDate;
    private double orderAmount;


//    private Commissioned commission;

    public Order(String orderNum, LocalDate orderDate, double orderAmount) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }





    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

//    public Commissioned getCommission() {
//        return commission;
//    }
//
//    public void setCommission(Commissioned commission) {
//        this.commission = commission;
//    }

}
