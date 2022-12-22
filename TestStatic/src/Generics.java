
class C1{
    public void m1()
    {
        System.out.println("m1");
    }
}

class C2 extends C1{
    public void m2()
    {
        System.out.println("m2");
    }
}

class C3 extends C2{
    public void m2()
    {
        System.out.println("m3");
    }
}

public class Generics <T extends C2>{


    private int items = 0;
    private int size = 5;
    T genA [] = (T[])new Object[size];

    public void printArr()
    {
        for (int i =0; i<items; i++)
        {
            System.out.println(this.genA[i]);
        }
    }

    public void addItem(T... newItem)
    {
        for (int j = 0; j < newItem.length; j++)
        {
            genA[items++] = newItem[j];
            if (items == size)
            {
                increaseSize();
            }

        }
    }


    public void deleteLast(int index)
    {
        items--;
    }

    private void increaseSize()
    {
        size <<= 1;
        T temp [] = (T [])new Object[size];

        for (int i=0; i<items; i++)
        {
            temp[i] = genA[i];
        }
        System.out.println("size increased:" + size);
        this.genA = temp;

    }

}
