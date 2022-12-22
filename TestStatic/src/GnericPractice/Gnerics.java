package GnericPractice;

public class Gnerics <T>{


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
        size*=2;
        T temp [] = (T [])new Object[size];

        for (int i=0; i<items; i++)
        {
            temp[i] = genA[i];
        }
        System.out.println("size increased:" + size);
        this.genA = temp;

    }

}
