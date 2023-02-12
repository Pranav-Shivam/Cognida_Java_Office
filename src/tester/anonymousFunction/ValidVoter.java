package tester.anonymousFunction;

import java.util.function.IntPredicate;

public class ValidVoter {
    public static void main(String[] args) {
        IntPredicate voter=new IntPredicate() {
            @Override
            public boolean test(int value) {
                if(value>=18)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
        System.out.println(voter.test(16));
    }
}
