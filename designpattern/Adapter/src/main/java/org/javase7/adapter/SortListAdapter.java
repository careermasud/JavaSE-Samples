package org.javase7.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Masudul Haque
 */
public class SortListAdapter implements Sorter {

    @Override
    public Integer[] sort(Integer[] numbers) { 
        //convert the array to a List
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.addAll(Arrays.asList(numbers));
        //call the adapter 
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);

        //convert the list back to an array and return 
        
        Integer sortedNumbers[] = numberList.toArray(new Integer[numberList.size()]);
        return sortedNumbers;
    }

}
