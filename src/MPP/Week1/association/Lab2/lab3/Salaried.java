package MPP.Week1.association.Lab2.lab3;

public class Salaried extends Employee{
    double salary;

    public Salaried(String EmpId , double salary) {
        super(EmpId);
        this.salary = salary;
    }

    @Override
    public double calGrossPay() {
        return calcCompensation().getNetPay();
    }

    @Override
    public PayCheck calcCompensation() {
        PayCheck salariedPaycheck = new PayCheck(salary);
        return salariedPaycheck;
    }

    @Override
    public void print(){
        System.out.println("salaried GrossPay :" + salary);
        System.out.println("Salaried NetPay : " + calGrossPay());
        calcCompensation().print();
    }
}
