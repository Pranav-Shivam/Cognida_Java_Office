package tester.classesPratice;

class ShopDoor
{
    public boolean isLocked(String key)
    {
        class Lock
        {
            public boolean isLocked(String key)
            {
                if(key.equals("Ram"))
                {
                    System.out.println("Doors is open for every one");
                    return true;
                }
                else
                {
                    System.out.println("Doors is not open for every one");
                    return false;
                }
            }
        }
        return new Lock().isLocked(key);
    }
}
public class LocalInnerClassPratice {
    public static void main(String[] args) {
        ShopDoor sd=new ShopDoor();
        System.out.println(sd.isLocked("Ravan"));
    }
}
