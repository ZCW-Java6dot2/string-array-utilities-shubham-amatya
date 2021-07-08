package com.zipcodewilmington;





import java.util.Arrays;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        String firstElement = array[0];

        return firstElement;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {


        String secondElement = array[1];

        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String lastElement = array[array.length-1];
        return lastElement;
    }


    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        String secondToLast = array[array.length-2];

        return secondToLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {



        if (Arrays.stream(array).anyMatch(value::equals)) {
            return true;
        } else {

            return false;
        }

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {


        String arr[] = new String[array.length];
        String temp = "";

        for (int i = array.length-1; i>=0; i--) {
            //for (int j = 0; j <= i; j++) {
                temp += array[i] + " ";

        }
        arr = temp.split(" ");
       return arr;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {


        int count = 0;

        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            if(array[i] != array[n-1-i]){
                count = 1;
            break;
            }

        } if(count == 0){
            return true;
        }
        return false;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        int count = 0;
        if(array.length< 26){
            count = 1;
        }
        else if (array.length>=26){
            Arrays.sort(array);
            String S = array.toString();
            S.replace(" ", "");

            String alphabet = "abcdefghijklmnopqrstuvwxyz";
           if(S.equalsIgnoreCase(alphabet)){
               count = 0;
           }else {
               count = 1;
           }

        } boolean P;
        if (count == 0){
            P = true;
        } else{
            P = false;
        }

    return P;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;
        for(String a: array) {
            if (a.equalsIgnoreCase(value)) {
                count++;
            }
        }
        return count;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> ArrList = new ArrayList<String>(Arrays.asList(array));

            if(ArrList.contains(valueToRemove)){
                ArrList.remove(valueToRemove);
            }
            String [] improvedArr = ArrList.toArray(new String[ArrList.size()]);
        return improvedArr;
    }

        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){

            ArrayList<String> alist = new ArrayList<String>(Arrays.asList(array));
            for (int i = alist.size()-1; i>0; i--) {
                String A = alist.get(i);
                String B = alist.get(i - 1);
                if(A.equals(B)){
                    alist.remove(i-1);
                }
            }

            String [] sArray = alist.toArray(new String[alist.size()]);

            return sArray;
        }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence
     * concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> AList = new ArrayList<String>(Arrays.asList(array));
        StringBuilder concatinatedLetters = new StringBuilder();
        concatinatedLetters.append(array[0]);

        int i = 0;

        while(i< array.length){
            if(array[i].equals(array[i-1])){
                concatinatedLetters.append(array[i]);
            } else{
                AList.add(concatinatedLetters.toString());
                concatinatedLetters.setLength(0);
                concatinatedLetters.append(array[i]);
            }
        i++;

        }
        AList.add(concatinatedLetters.toString());
        String [] refinedArray = AList.toArray(new String [0]);
        return refinedArray;
    }

}

