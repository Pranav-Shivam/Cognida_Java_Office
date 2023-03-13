package tester.lambdaPratice;

@FunctionalInterface
interface evenOrOddNo
{
    boolean isEvenOrOdd(int n);
}
public class EvenOrOdd {
    public static void main(String[] args) {
        evenOrOddNo x=new evenOrOddNo() {
            @Override
            public boolean isEvenOrOdd(int n) {
                if (n%2==0) {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
        System.out.println(x.isEvenOrOdd(10));
        evenOrOddNo y=(int n)-> n%2==0;
        System.out.println(y.isEvenOrOdd(9));
    }
}
