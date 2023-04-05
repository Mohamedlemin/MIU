package FPP.Practice;

import java.util.Date;

public class EmployeeException {
    static class Employee{
        Date hireDate = new Date();
        public Object makeCopy() throws  Exception {
            try {
                Employee copy = (Employee) super.clone();
                copy.hireDate = (Date) hireDate;
                int a = 1 / 0;
                return copy;

            } catch (ArithmeticException a) {
                System.err.println("First Error ");
                throw new ArithmeticException("connot devide by 0");

            } catch (Exception e) {
                System.err.println("Second Error ");
                throw new ArithmeticException("connot make copy");
            } finally {
                System.err.println("Error in makeCopy()");
            }
        }

        public static class CallingClass{
            void callingMethod() throws Exception {
                Employee e = new Employee();
                e.makeCopy();
            }
        }

        public static void main(String[] args) {
            try {
                new CallingClass().callingMethod();
            }catch (Exception e){
                System.out.println("Exception message " + e.getMessage());
            }
        }
    }
}
