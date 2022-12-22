package TestG;

public class TG<T extends Number>{

    T someVar;
    T someVar2;


    public TG(T someVar, T someVar2)
    {

        this.someVar = someVar;
        this.someVar2 = someVar2;
    }

    public void print()
    {
        System.out.println();
    }

}
