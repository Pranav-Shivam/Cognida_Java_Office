package tester.lambdaPratice;

@FunctionalInterface
interface demoVar
{
    int sum();
}
@FunctionalInterface
interface demoVar1
{
    int sum();
}
public class LambdaDemo {
    public static void main(String[] args) {
        int x=10,y=20,z;
        //You cannot initialize the variable inside lambda function class or method variable
        demoVar s=()->{
            //You cannot initialize the variable inside lambda function class or method variable
            //But you can create and initialize the local variable inside lambda function
            int k=0;
            return (x+y);
        };
        z=s.sum();
        System.out.println("The sum is : "+z);


    }
}
