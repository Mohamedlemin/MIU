package MPP.Week1.association.Lab2.lab3;

public abstract class Employee {
    private String EmpId;
    public Employee(String EmpId){
        this.EmpId = EmpId;
    }
    public void print(){}
    public abstract double calGrossPay();

    public PayCheck calcCompensation(){
        return null;
    }

}
