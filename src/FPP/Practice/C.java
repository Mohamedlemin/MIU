package FPP.Practice;

class C extends B implements A{
    public void foo(){
        System.out.println(A.x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        new C().foo();
    }
}

