package FPP.Lesson3.inClassExo.souplyCouply;

public class TaxCalculator2023 implements TaxCalculator{
    private double taxIncame;
    

    public TaxCalculator2023(double taxIncame ) {
        this.taxIncame = taxIncame;
    }

    @Override
    public double calculator(){
        return taxIncame * 0.3;
    }


}
