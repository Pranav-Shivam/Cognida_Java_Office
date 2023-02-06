package tester.metodsPratice;

public class SmallestAmongThree {
    public static void main(String[] args) {
        System.out.println(smallestAmong3(3,9,1));
    }
    public static int smallestAmong3(int a,int b,int c)
    {
        int result=Integer.MIN_VALUE;
        result=(a<b)?((a<c)?a:c):((b<c)?b:c);
        return result;
    }
}
