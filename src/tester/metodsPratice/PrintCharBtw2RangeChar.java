package tester.metodsPratice;

public class PrintCharBtw2RangeChar {
    public static void main(String[] args) {
        printAllCharBtw('1','d');
    }
    public static void printAllCharBtw(char r1,char r2)
    {
        for (char i = r1; i <=r2; i++) {
            System.out.println(i);
        }
    }
}
