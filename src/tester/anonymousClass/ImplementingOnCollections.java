package tester.anonymousClass;

import java.util.*;

class Data
{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ImplementingOnCollections {
    public static void main(String[] args) {
        List<Data> list=new ArrayList<>();
        list.add(new Data("Pranav"));
        list.add(new Data("Shivam"));
        list.add(new Data("Singh"));
        list.add(new Data("Tomar"));
        list.add(new Data("Prem"));

        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data a, Data b) {
                return a.getName().compareTo(b.getName());
            }
        });
        for(Data d:list)
        {
            System.out.println(d.getName());
        }
    }
}
