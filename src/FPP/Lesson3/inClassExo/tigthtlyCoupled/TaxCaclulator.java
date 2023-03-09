package FPP.Lesson3.inClassExo.tigthtlyCoupled;

public class TaxCaclulator {
    private double taxIncame;

    public TaxCaclulator(double taxIncame ) {
        this.taxIncame = taxIncame;
    }
    public double Calulator (){
        return taxIncame * 0.3; // if we change this value all related methode will be recompiled
    }
}
