package main;
/**
 * Created by eule on 7/18/16.
 */

import java.util.LinkedList;
import java.util.List;
public class Sorter {

    private static List<? extends Comparable> swap(List list, int a, int b){
        Object hilf = list.get(a);
        list.set(a,list.get(b));
        list.set(b, hilf);
        return list;
    }

    public  static List bubbleSort(List<? extends Comparable> list) throws NullPointerException{
        int changes = 0;
        do{
            changes=0;
            for(int i = 0; i<list.size()-1; i++){
                Comparable first = list.get(i);
                Comparable second = list.get(i+1);
                if( first.compareTo(second)>0){
                    list= swap(list, i, i+1);
                    changes+=1;
                }
            }
        }while (changes>0);
        return list;
    }

}
