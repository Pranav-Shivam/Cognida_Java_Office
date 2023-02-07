package tester.exceptionHndling;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample ep=new ExceptionExample();
        ep.artExp();
        ep.ArrayOutOfBoundExp();
        ep.numberFormatExp();
        ep.nullPointer();

    }

    public void artExp() {
        try {
            int a = 50 / 0;//ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void nullPointer() {
        try {
            String s = null;//nullPointer Exception
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void numberFormatExp() {
        try {
            String s = "abc";//Number Format Exception
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public void ArrayOutOfBoundExp() {
        try {
            int a[] = new int[5];
            a[10] = 50; //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
