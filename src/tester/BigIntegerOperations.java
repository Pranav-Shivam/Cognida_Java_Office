package tester;

import java.math.BigInteger;

public class BigIntegerOperations {
    public static void main(String[] args) {
        //bigIntFromVariousDataTypes();
        bigIntegerArthmeticOperations();
    }
    public static void bigIntFromVariousDataTypes()
    {
        BigInteger biFromString=new BigInteger("1234567891008");
        System.out.println("BigInteger from String : "+biFromString);
        BigInteger biFromByteArray=new BigInteger(new byte[]{1,2,3,4,5});
        System.out.println("BigInteger from Byte Array : "+biFromByteArray);
        BigInteger biFromByteArrayWithMagnitude=new BigInteger(-1,new byte[]{1,2,3,4,5});
        System.out.println("BigInteger from byte array with -ve sign : "+biFromByteArrayWithMagnitude);


        BigInteger biFromLong =  BigInteger.valueOf(2305843009213693951L);
        System.out.println("BigInteger from Long : "+biFromLong);

    }

    public static void bigIntegerArthmeticOperations()
    {
        BigInteger x=new BigInteger("16");
        BigInteger y=new BigInteger("10");

        System.out.println("Comparing two Big Integer : "+y.compareTo(x));

        BigInteger add=x.add(y);
        System.out.println("Adding : "+add);
        BigInteger sub=x.subtract(y);
        System.out.println("Subtracting : "+sub);
        BigInteger multi=x.multiply(y);
        System.out.println("Multiplying : "+multi);
        BigInteger quotient=x.divide(y);
        System.out.println("Dividing : "+quotient);

        BigInteger hcf=x.gcd(y);
        System.out.println("Hcf : "+hcf);
        BigInteger reminder=x.mod(y);
        System.out.println("Reminder of x%y : "+reminder);

        //Checking prime no or not
        boolean isPrime=x.isProbablePrime(1);
        System.out.println(x+" is "+isPrime+" a prime no ");
    }
}
