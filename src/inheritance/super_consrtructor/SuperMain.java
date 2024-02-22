package inheritance.super_consrtructor;

public class SuperMain {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // 1. SupClass > SuperClass > GrandClass
        // 2-1. GrandClass() > SuperClass() > SupClass()
        // 2-2. GrandClass() > SuperClass(100) > SupClass()
    }


}
