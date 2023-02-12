package tester.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOps {
    public static void main(String[] args) {
        List<String> names = List.of("Pranav", "Shivam", "Radhe", "Ram");
        names.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------------------------");
        List.of(1, 2, 3, 4, 5, 6, 7).stream().map(i -> i * i).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------------------------------------");
        List.of(17, 32, 6, 13, 31).stream().sorted().forEach(System.out::println);

        System.out.println("--------------------------------------");
        //Minimum and Maximum
        List<Integer> nums=List.of(11,12,5,8,10,4);
        int min=nums.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum no is : "+min);

        //Maximum
        int max=nums.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max  >> "+max);
    }
}
