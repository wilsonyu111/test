package InterfacesPractice;

import java.util.List;

public class Data implements ModifyData{

    List dataList;
    public Data(List aList)
    {
        dataList = aList;
    }

    @Override
    public void readList() {
        for (int i=0; i<dataList.size(); i++)
        {
            System.out.println(dataList.get(i));
        }
    }

    @Override
    public void addToList(int val) {
        dataList.add(val);
    }

    @Override
    public void removeLast() {
        if (dataList.size() > 0) {
            dataList.remove(dataList.size() - 1);
        }
    }

    @Override
    public void removeHead() {
        if (dataList.size() > 0)
        {
            dataList.remove(0);
        }
    }
}

//}
