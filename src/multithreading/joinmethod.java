package multithreading;
class thread1 extends Thread{
    public void run()
    {
        for(int i=0;i<=20;i++)
        {
            System.out.println(i);
        }
    }
}
class thread2 extends Thread {
    public void run()
    {
        for(int i=30;i<=50;i++)
        {
            System.out.println(i);
        }
    }
}
public class joinmethod {
    public static void main(String[] args)
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        try{
        t1.start();
        t1.join();
        t2.start();
        }
        catch(Exception e)
        {}
    }
}
