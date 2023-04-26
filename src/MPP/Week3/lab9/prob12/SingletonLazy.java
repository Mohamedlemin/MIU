package MPP.Week3.lab9.prob12;

public class SingletonLazy {

    private static SingletonLazy instance = null;
    private SingletonLazy(){

    }
    // not thread safe because in this function
    // two thread may create more than one instance
    public  SingletonLazy getInstance(){
        if (instance ==null)
            return new SingletonLazy();
        return instance;
    }
}
