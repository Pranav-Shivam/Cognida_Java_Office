package tester.lambdaPratice;


import java.util.*;

class Data1 {
    private String name;

    public Data1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data1{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class LambdaOnCollections {
    public static void main(String[] args) {
        List<Data1> list = new ArrayList<>();
        list.add(new Data1("Pranav"));
        list.add(new Data1("Shivam"));
        list.add(new Data1("Singh"));
        list.add(new Data1("Tomar"));
        list.add(new Data1("Prem"));

//        Collections.sort(list,(Data1 a,Data1 b)->{
//            return a.getName().compareTo(b.getName());
//        });


        //Sorting on basis of length
        Collections.sort(list, (Data1 a, Data1 b) -> {
            if (a.getName().length() < (b.getName().length())) {
                return -1;
            } else if (a.getName().length() > (b.getName().length())) {
                return 1;
            } else {
                return 0;
            }
        });

        System.out.println(list);

//        //printing the collections
//        list.forEach(e -> System.out.println(e.getName());

        //conditional statement
        list.forEach(e->{
            if(e.getName().startsWith("Pr"))
            {
                System.out.println(e.getName());
            }
        });
    }
}
