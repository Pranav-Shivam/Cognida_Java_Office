package tester.lambdaPratice;

import java.util.function.IntPredicate;

public class ValidVoterLambda {
    public static void main(String[] args) {
        IntPredicate voter=i->i>18;
        //System.out.println(voter.test(17));


        //Using 2 predicates together
        IntPredicate voteId=i->i>100;
        System.out.println(voter.and(voteId).test(36)); //we can also use or in place of and
    }
}
