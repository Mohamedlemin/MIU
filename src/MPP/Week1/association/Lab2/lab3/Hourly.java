package MPP.Week1.association.Lab2.lab3;

public class Hourly extends Employee{
    private  double hourlyWage;
    private  double hoursPerWeek;

    public Hourly(String EmpId ,double hourlyWage, double hoursPerWeek) {
        super(EmpId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calGrossPay() {
        return calcCompensation().getNetPay();
    }
    @Override
    public PayCheck calcCompensation(){
        PayCheck hourlyPayCheck = new PayCheck(hourlyWage * 4 * hoursPerWeek);
        return hourlyPayCheck;
    }

    @Override
    public void print(){
        System.out.println("Hourly GrossPay :" + hourlyWage * 4 * hoursPerWeek);
        System.out.println("Hourly NetPay : " + calGrossPay());
        calcCompensation().print();
    }

}
