import MergeSort.MergeS;
import TestG.TG;

import java.util.*;

public class Main {

    public static void main (String args[])
    {
        Integer [] l1 = {-1,-2,-3,-4,-5,-6};
        MergeS m = new MergeS(l1);


        m.sort();
        m.printArr();

    }


}
