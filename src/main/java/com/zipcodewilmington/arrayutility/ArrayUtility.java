package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private T [] StoredArray;

    public ArrayUtility(T[] storedArrays) {

        StoredArray = storedArrays;
    }

    public int countDuplicatesInMerge(Object[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;

        for( Object n : arrayToMerge) {
            if (n.equals(valueToEvaluate)) {

                count++;
            }

        }

        return count + getNumberOfOccurrences( valueToEvaluate );
    }



    public T getMostCommonFromMerge(T[] arrayToMerge) {

        T mostCommon = null;
        Integer countera = 0;

        for( T r : arrayToMerge) {

        }

        return null;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate) {

        Integer count = 0;
        for (T n : StoredArray) {
            if(n.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;

    }


    public T[] removeValue(T valueToRemove) {
        Integer count = 0;
        for(T t : StoredArray) {
            if (t.equals(valueToRemove)) {
                count++;
            }
        }

        T[] returnArray = (T[]) Array.newInstance(valueToRemove.getClass(),StoredArray.length-count);
        Integer counta =0;
        for(T n : StoredArray) {
            if(!n.equals(valueToRemove)) {
                returnArray[counta] = n;
                counta++;
            }
        }


        return returnArray;
    }


}
