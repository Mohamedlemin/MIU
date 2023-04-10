package MPP.midterm.association.Lab2.lab3;

public final class PayCheck {
   private double crossPay;
   private final  double fica;
   private final double state ;
   private final double local ;
   private final double medicare ;
   private final double socialSecurity ;

   public PayCheck(double crossPay) {
      this.crossPay = crossPay;
      this.fica  = crossPay * 23/ 100;
      this.state = crossPay * 5 /100;
      this.local = crossPay * 1 /100;
      this.medicare = crossPay * 3 /100;
      this.socialSecurity =crossPay *7.5 /100;
   }

   public void print(){
       System.out.println("FICA : " + fica);
       System.out.println("state : " + state);
       System.out.println("local : " + local);
       System.out.println("medicare : " + medicare);
       System.out.println("socialSecurity : " + socialSecurity);
   }
   public double getNetPay(){
       double totalTax = fica + state + local + medicare + socialSecurity;
       return crossPay - totalTax;
    }

}
