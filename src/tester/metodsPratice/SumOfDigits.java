package tester.metodsPratice;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(153));
    }
    public static int sumOfDigit(int n)
    {
        int r=0;
        //System.out.println("heloo");
        while(n>0){
            int d=n%10;
            //System.out.println(d);
            r=r+d;
            n=n/10;
        }
        return r;
    }
}
