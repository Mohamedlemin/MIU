package MPP.Week3;

public enum Constants {
    Compony("microsoft"),
    Seles_Target(20000);
    private String strVal;
    private int intVal;
    Constants(String s){
        strVal = s;
    }
    Constants(int val){
        intVal =val;
    }
    public int intVal(){
        return intVal;
    }
    public String strVal(){
        return strVal;
    }

}
