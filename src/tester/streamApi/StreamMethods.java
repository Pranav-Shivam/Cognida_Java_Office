package tester.streamApi;

import tester.classPratice.A;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamMethods {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        //System.out.println(sums(arr));
        goThrough(arr);
    }

    public static int sums(int arr[]) {
        IntStream st = Arrays.stream(arr);
        int su = st.sum();
        return su;
    }

    public static void goThrough(int arr[]) {
        Arrays.stream(arr).map(x -> {
            int ct = 0;
            if (x == 1) {
                return -1;
            }
            for (int i = 2; i <= x; i++) {
                if (x % i == 0) {
                    ct++;
                }
                if (ct > 1) {
                    return -1;
                }
            }
            return x;
        }).forEach(System.out::println);
    }

}
