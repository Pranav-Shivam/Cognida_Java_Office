package tester.anonymousClass;

public class FunctionInterfaceEg {
    public static void main(String[] args) {
        //use of functional interface using anonymous class
        functionInterface1 x=new functionInterface1() {
            @Override
            public void sayHi() {
                System.out.println("Jai Shree Ram");
            }
        };
        x.sayHi();

        //using lambda

        functionInterface1 l=()->{
            System.out.println("Har Har Mahadev");
        };
    }
}
