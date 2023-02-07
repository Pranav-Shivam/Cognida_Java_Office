package tester.exceptionHndling;

public class ThrowKeyword {
    public static void main(String[] args) {
        validate(13);
    }
    public static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else
        {
            System.out.println("Eligible for vote");
        }
    }
}
