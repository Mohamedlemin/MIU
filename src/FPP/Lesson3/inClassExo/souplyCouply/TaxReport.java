package FPP.Lesson3.inClassExo.souplyCouply;


public class TaxReport {

    private TaxCalculator calculator;

    // constructor  injection  the popular one
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    // methode injection
    public void showTax(TaxCalculator calculator){
        double tax = calculator.calculator();
        System.out.println(tax);
    }

    // setter  injection we use it if we want to inject another class in runtime
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
