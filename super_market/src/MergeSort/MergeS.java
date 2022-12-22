package MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeS {

    Integer [] list;

    public MergeS(Integer [] list)
    {
        this.list = list;
    }

    public void sort()
    {
        if (list.length > 0)
        {
            this.list = sortHelper(0, list.length-1);

        }
    }

    private Integer [] sortHelper(int startIndex, int endIndex)
    {

        if (startIndex == endIndex)
        {
            Integer [] temp = new Integer[1];
            temp [0] = this.list[startIndex];
            return temp;
        }else{
            int mid = (endIndex + startIndex)/2;
            Integer [] new1  = this.sortHelper(startIndex, mid);
            Integer [] new2  = this.sortHelper(mid+1, endIndex);

            return this.combineArr(new1, new2);
        }


    }

    private Integer [] combineArr (Integer [] arr1,Integer [] arr2 )
    {

        Integer [] temp = new Integer[arr1.length+arr2.length];
        int p1 = 0;
        int p2 = 0;
        int t1 = 0;

        while (p1 < arr1.length || p2 < arr2.length)
        {
            if (p1 < arr1.length && p2 < arr2.length && arr1[p1] <= arr2[p2])
            {
                temp[t1] = arr1[p1++];
            }
            else if (p1 < arr1.length && p2 < arr2.length && arr1[p1] > arr2[p2])
            {
                temp[t1] = arr2[p2++];
            }
            else if (p1 < arr1.length)
            {
                temp[t1] = arr1[p1++];
            }
            else
            {
                temp[t1] = arr2[p2++];
            }
            t1 ++;
        }

        return temp;

    }

    public void printArr()
    {
        for (Integer integer : Arrays.stream(this.list).toList()) {
            System.out.println(integer);
        }

    }
}

// 0,1,2,3,4,5,6,7
// 1,2,3,4,5,6,7,8

//4,5,6,7
//
//11/2 = 5
//13/2 = 6
//
//p1 < l1 && p2 < l2 && arr1[p1] <= arr2[p2]
//
//p1 < l1 && p2 < l2 && arr1[p1] > arr2[p2]
//
//p1 < l1
//add all in p1 to temp
//
// p2 < l2
// add all in p2 to temp
//
