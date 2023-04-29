package MPP.Week3.lab9.singletonImplementation;

public class SingletonLazy {

    private static SingletonLazy instance = null;
    private SingletonLazy(){

    }
    // not thread safe because in this function
    // two thread may create more than one instance
    // we can solve that by adding     public synchronized SingletonLazy getInstance(){
    public  synchronized SingletonLazy getInstance(){
        if (instance ==null)
            return new SingletonLazy();
        return instance;
    }
}
