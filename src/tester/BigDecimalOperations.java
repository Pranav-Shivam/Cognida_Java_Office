package tester;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;

public class BigDecimalOperations {
    public static void main(String[] args) {
        //bigDecimalFromVariousDataTypes();
        //roundingBigDecimal();
        bigDecimalArthmeticOperations();
    }
    @Test
    public static void bigDecimalFromVariousDataTypes()
    {
        BigDecimal bdFromString=new BigDecimal("0.1");
        BigDecimal bdFromCharArray=new BigDecimal(new char[]{'3','.','1','4','2'});
        BigDecimal bdFromInt=new BigDecimal(2618);
        BigDecimal bdFromLong=new BigDecimal(1234567890108L);
        BigInteger biInt=new BigInteger(100,new Random());
        BigDecimal bdFromBigInt=new BigDecimal(biInt);
        System.out.println("bdFromBigInt >> "+bdFromBigInt);
        System.out.println("bdFromCharArray >> "+bdFromCharArray);
        System.out.println("bdFromInt >> "+bdFromInt);
        System.out.println("bdFromLong >> "+bdFromLong);
        System.out.println("bdFromString >> "+bdFromString);

        assertEquals("0.1",bdFromString.toString());
        assertEquals("3.142",bdFromCharArray.toString());
        assertEquals("2618",bdFromInt.toString());
        assertEquals("1234567890108",bdFromLong.toString());
        assertEquals(biInt.toString(),bdFromBigInt.toString());
    }
    public static void roundingBigDecimal()
    {
        BigDecimal bd=new BigDecimal(1234.567832);
        int precision=6;
        BigDecimal roundOff=bd.round(new MathContext(precision));
        System.out.println("Normal Round-Off upto  precision is >> "+ roundOff);
        BigDecimal rCeiling=bd.round(new MathContext(precision, RoundingMode.CEILING));
        System.out.println("Ceiling Round-Off upto  precision is >> "+ rCeiling);
        BigDecimal rFloor=bd.round(new MathContext(precision,RoundingMode.FLOOR));
        System.out.println("Floor Round-Off upto  precision is >> "+ rFloor);
        BigDecimal rUp=bd.round(new MathContext(precision,RoundingMode.UP));
        System.out.println("Up Round-Off upto  precision is >> "+ rUp);
        BigDecimal rDown=bd.round(new MathContext(precision,RoundingMode.DOWN));
        System.out.println("Down Round-Off upto  precision is >> "+ rDown);
        BigDecimal rHalf_Up=bd.round(new MathContext(precision,RoundingMode.HALF_UP));
        System.out.println("Half-Up Round-Off upto  precision is >> "+ rHalf_Up);
        BigDecimal rHalf_Down=bd.round(new MathContext(precision,RoundingMode.HALF_DOWN));
        System.out.println("Half-Down Round-Off upto  precision is >> "+ rHalf_Down);
        BigDecimal rHalf_Even=bd.round(new MathContext(precision,RoundingMode.HALF_EVEN));//most used also known as Banker's Rounding
        System.out.println("Half Even upto  precision is >> "+ rHalf_Even);
        try {
            BigDecimal runecessary=bd.round(new MathContext(precision,RoundingMode.UNNECESSARY));
            System.out.println("Up Round-Off upto 3 precision is >> "+ runecessary);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public static void bigDecimalArthmeticOperations()
    {
        BigDecimal quantity=new BigDecimal("4.5");
        BigDecimal unitPrice=new BigDecimal("50.89");
        BigDecimal discountRate=new BigDecimal("0.15");
        BigDecimal taxRate=new BigDecimal("0.18");

        //operations
        BigDecimal amount=quantity.multiply(unitPrice);
        BigDecimal discount=quantity.multiply(discountRate);
        BigDecimal discountedAmount=amount.subtract(discount);
        BigDecimal tax=discountedAmount.multiply(taxRate);
        BigDecimal totalAmount=discountedAmount.add(tax);
        BigDecimal payingAmount=totalAmount.round(new MathContext(5,RoundingMode.HALF_EVEN));
        System.out.println("The Amount of a customer is >> "+ payingAmount);

        //System.out.println(payingAmount.equals(totalAmount));
    }
}
