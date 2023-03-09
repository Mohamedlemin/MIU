package FPP.Lesson3.inClassExo.tigthtlyCoupled;

public class ReportTax {
    private TaxCaclulator taxCalculator;

    public ReportTax() {
        taxCalculator = new TaxCaclulator(10_000); // Error if we change the TaxCalulator constructor
    }
    public void showTax(){
       double tax = taxCalculator.Calulator();// Error if we change the TaxCalculator calculator
        System.out.println(tax);

    }
}
