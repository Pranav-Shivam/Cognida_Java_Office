package tester.streamApi;

// interface implementation
@FunctionalInterface
interface StaticandDefaultMethods{
    // abstract method
    int square(int x);
    // default methods
    default int add(int a, int b){
        return a+b;
    }
    default int sub(int a, int b){
        return a-b;
    }
    // static methods
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
}

// public class
public class FunctionalInterfaceUses implements StaticandDefaultMethods{
    public static void main(String[] args){
        int a = 8;
        int b = 6;
        // object of test class
        FunctionalInterfaceUses t = new FunctionalInterfaceUses();
        // default method called using class object
        int add = t.add(a,b);
        int sub = t.sub(a,b);
        // static methods called directly by the interface name
        int mul = StaticandDefaultMethods.multiply(a,b);
        int div = StaticandDefaultMethods.divide(a,b);
        System.out.println(add+" "+sub+" "+mul+" "+div);
    }
    // abstract method
    @Override
    public int square(int x) {
        return x*x;
    }
}
