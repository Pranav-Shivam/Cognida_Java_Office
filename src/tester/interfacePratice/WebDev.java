package tester.interfacePratice;

interface web_client
{
    void frontend();
    void backend();
    void database();
}

abstract class Frontend implements web_client
{
    @Override
    public void frontend()
    {
        System.out.println("HTML, CSS AND JS");
    }
}

class Developers extends  Frontend
{
    @Override
    public void backend()
    {
        System.out.println("Java and AJAX");
    }
    @Override
    public void database()
    {
        System.out.println("MongoDB");
    }
}
public class WebDev {
    public static void main(String[] args) {
        web_client w=new Developers();
        w.frontend();
        w.backend();
        w.database();
    }
}
