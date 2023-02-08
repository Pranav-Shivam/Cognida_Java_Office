package tester.genericPratice;

class Data
{
    private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}
class GenericClass1<T>
{
    private T data;

    public GenericClass1(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "GenericClass1{" +
                "data=" + data +
                '}';
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        GenericClass1<String> d=new GenericClass1<String>("Jai Shree Ram");
        String data=d.getData();
        System.out.println(data);
    }
}
