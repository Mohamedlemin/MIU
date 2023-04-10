package MPP.midterm.association.Lab2.lab3;

import java.util.List;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String EmpId, double commission, double baseSalary, List<Order> orders) {
        super(EmpId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    public double getOrdersAmount(){
        double total = 0;
        for (Order e:
             orders) {
            total += e.getOrderAmount();
        }
        return total;
    }

    @Override
    public double calGrossPay() {
        return calcCompensation().getNetPay();
    }
    @Override
    public PayCheck calcCompensation(){
        double previousMonthsCommission = commission * getOrdersAmount();
        double crossPay = previousMonthsCommission+ baseSalary;
        PayCheck commissionedPayCheck  = new PayCheck(crossPay);
        return commissionedPayCheck;
    }

    @Override
    public void print(){
        double crossPay = commission * getOrdersAmount() +baseSalary;
        System.out.println("Commission GrossPay :" +  crossPay);
        System.out.println("Commissioned NetPay : " + calGrossPay());
        calcCompensation().print();

    }
}
