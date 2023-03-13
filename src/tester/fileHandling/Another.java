package tester.fileHandling;
interface evenOdd{
    void isEven();
}
public class Another {
    static int a = 3;
    //a++;
    public static void main(String[] args) {
        evenOdd x = new evenOdd() {
            @Override
            public void isEven() {
                System.out.println(a);
            }
        };

    }
}
