package FPP.Lesson4.Lab5.assigment1;

public class Singleton {
  public static final Singleton instance = getInstance();

  private Singleton(){ }

  public static Singleton getInstance(){
      return instance;
  }
}

//        The MySingleton class has a private constructor,
//        so it can't be instantiated from outside the class.
//        The class has a private static final instance of itself named INSTANCE.
//        The getInstance() method returns this instance, ensuring that all callers
//        receive the same instance of the class.
//        Because the INSTANCE variable is static and final, it is initialized only once
//        when the class is loaded into the JVM,
//        ensuring that all calls to getInstance() return the same instance.