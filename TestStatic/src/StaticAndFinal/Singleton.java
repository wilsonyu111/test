package StaticAndFinal;

public class Singleton {
    private static Singleton single = null;
    private int val1;
    private int val2;
    private Singleton(int val1, int val2 )
    {
        this.val1 = val1;
        this.val2 = val2;
    }

    static public Singleton getInstance(int val1, int val2)
    {
        if (single == null)
        {
            System.out.println("make new object");
            single = new Singleton(val1, val2);
        }
        else
        {
            System.out.println("object already exist");
        }

        return single;
    }

    static public void destroyInstance()
    {
        System.out.println("removing object");
        single = null;
    }

    public void newObj()
    {
        System.out.println("new object's value: " + val1 + ", " + val2);
    }
}
