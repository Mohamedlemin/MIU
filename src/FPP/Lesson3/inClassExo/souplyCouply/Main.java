package FPP.Lesson3.inClassExo.souplyCouply;

public class Main {
    public static void main(String[] args) {
        var taxCalculator2023 = new TaxCalculator2023(10_000);
        var taxReport = new TaxReport(taxCalculator2023);
        //if we use methode injection we don't need this line
        // var taxReport = new TaxReport(taxCalculator2023);
        taxReport.showTax(taxCalculator2023);
        taxReport.showTax(new taxCalculator2024());
        System.out.println();
    }
}

