package main;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by eule on 7/18/16.
 */
public class SorterTest {

    List nullList;
    List containsNull = new LinkedList();
    List orderedList= new LinkedList();
    List notOrdered= new LinkedList();
    List reversedList= new LinkedList();
    List notComparableList= new LinkedList();
    @Before
    public void setUp() throws Exception{
        nullList= null;
        containsNull = new LinkedList();
        containsNull.add(null);
        containsNull.add(1);

        orderedList.add(1);
        orderedList.add(2);
        orderedList.add(3);
        orderedList.add(4);

        notOrdered.add(3);
        notOrdered.add(2);
        notOrdered.add(4);
        notOrdered.add(1);

        reversedList.add(4);
        reversedList.add(3);
        reversedList.add(2);
        reversedList.add(1);


        notComparableList.add(new ProcessBuilder());
        notComparableList.add(1);

    }

    @Test(expected = NullPointerException.class)
    public void bubbleSortExceptions() throws Exception {
        Sorter.bubbleSort(containsNull);
        Sorter.bubbleSort(null);
        Sorter.bubbleSort(notComparableList);
    }
    @Test
    public void bubbleSort() throws Exception {
        assertEquals(orderedList,Sorter.bubbleSort(notOrdered));;
        assertEquals(orderedList, Sorter.bubbleSort(reversedList));
        assertEquals(orderedList, Sorter.bubbleSort(orderedList));
    }

}