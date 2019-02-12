import java.util.Arrays;
import java.lang.reflect.Array;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int i = array.length;
        return array[i - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        
        
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        
        String[] newArray = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
        newArray[array.length - (i + 1)] = array[i];

        }

        return newArray;
    }



    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean pal = false;
        if (Arrays.equals(reverse(array), array)){
            pal = true;
        } else {
            pal = false;
        }
        return pal;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] mark = new boolean[26]; 
        int index = 0; 
        String str = Arrays.toString(array);
   
        for (int i = 0; i < str.length(); i++) 
        { 

            if ('A' <= str.charAt(i) &&  
                    str.charAt(i) <= 'Z') 
                          
                    index = str.charAt(i) - 'A'; 

                else if('a' <= str.charAt(i) &&  
                        str.charAt(i) <= 'z') 
                              
                        index = str.charAt(i) - 'a'; 

            mark[index] = true; 
        } 

        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 

        return (true); 
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int j = 0; 
        for(int i = 0 ; i < array.length ; i++){
         if(array[i].equals(value)){
             j++;
            }
        }
        return j;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int arrayLength = array.length - getNumberOfOccurrences(array, valueToRemove);
        String[] newArray = new String[arrayLength];
        int newArrIndex = 0;
        for(int i = 0 ; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                newArray[newArrIndex] = array[i];
                newArrIndex++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
     public static String[] removeConsecutiveDuplicates(String[] array) {
         int newtArrIndex = 1;
         int newArrayLength = 0;

         for(int i = 0 ; i < array.length; i++){
              if(!array[i].equals(array[newtArrIndex])){
                    newArrayLength++;
                    newtArrIndex++;
                } 
             }  if (!array[array.length-1].equals(array[array.length-2])){
                    newArrayLength++;
             }
            
            
            String last = array[array.length-1];
            String secondLast = array[array.length-2];
            String[] newArray = new String[newArrayLength];
            
            if (last.equals(secondLast)){
                newArray[newArray.length -1] = array[array.length-1];
            }
        
        
            int newArrIndex = 1;
            newArray[0] = array[0];
            for(int i = 0 ; i < array.length - 1; i++){
            if(!array[i].equals(array[newArrIndex])){
                newArray[newArrIndex] = array[i];
                newArrIndex++;
            }    
            } 

        return newArray;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int nextArrIndex = 1;
        int newArrayLength = 1;
        // finding the length of the new array
        for(int i = 0 ; i < array.length - 1; i++){
            if(!array[i].equals(array[nextArrIndex])){
                newArrayLength++;
                nextArrIndex++;
            } else {
                nextArrIndex++;
            }
        }
        String[] newArray = new String[newArrayLength];
        int newArrIndex = 1;
        newArray[0] = array[0];
        for(int i = 0 ; i < array.length - 1; i++){
            if(!array[i].equals(array[newArrIndex])){
                newArray[newArrIndex] = array[i];
                newArrIndex++;
            } else {
                newArrIndex++;
            }
        }
        return newArray;
    }


}
