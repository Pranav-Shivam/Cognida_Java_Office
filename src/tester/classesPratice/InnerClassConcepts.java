package tester.classesPratice;

class Door
{
    private Lock lock;
    public Door()
    {
        lock=new Lock(true);
    }
    public Lock getLock()
    {
        return lock;
    }

    public void shopStatus()
    {
        if(lock.isLock())
        {
            System.out.println("Shop is closed!! Please visit next time");
        }
        else
        {
            System.out.println("Welcome, we are open now");
        }
    }
    public class Lock
    {
        private boolean lock;
        public Lock(boolean lock)
        {
            this.lock=lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
public class InnerClassConcepts {
    public static void main(String[] args) {
        Door door=new Door();
        door.shopStatus();
        System.out.println("\n");
        door.getLock().setLock(false);
        door.shopStatus();
    }

}
