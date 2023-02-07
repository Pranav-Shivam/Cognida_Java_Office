package tester.interfacePratice;

interface brahma
{
    void creation();
}
interface vishnu extends brahma
{
    void preserve();
}
interface shiva extends vishnu
{
    void destroy();
}

class Indra implements shiva
{
    @Override
    public void creation() {
        System.out.println("Creating the Universe");
    }

    @Override
    public void preserve() {
        System.out.println("Preserving the Universe");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying the Universe");
    }

    public void maintain()
    {
        System.out.println("King Of the Universe");
    }
}
public class ExtendingInterface {
    public static void main(String[] args) {
        Indra storm=new Indra();
        storm.creation();
        storm.preserve();
        storm.destroy();
        storm.maintain();
    }
}
