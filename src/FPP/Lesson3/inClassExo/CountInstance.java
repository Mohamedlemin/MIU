package FPP.Lesson3.inClassExo;

public class CountInstance {
    private static  int count;
    CountInstance(){
        ++count;
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new CountInstance();
        }
        System.out.println("Number of instance  :"+CountInstance.count);
    }

}
