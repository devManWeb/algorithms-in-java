/**
 * A recursive insertion sort, but in the opposite order
 */
public class inverseInsertionSort{

    /**
     * @param array of ints to sort with insertion sort
     * @param start of the unsorted part
     * @return sorted array of ints
     * @throws IllegalArgumentException when the arguments are not corrected
     */
    public static int[] sort(int[] array, int start){

        if(array == null || start < 0 || start > array.length){
            throw new IllegalArgumentException();
        }
        
        if(start == array.length || array.length == 1){
            return array;
        }

        int tempValue = 0;
        int counter = start;

        while(counter > 0){
            if(array[counter-1] > array[counter]){
                tempValue = array[counter-1];
                array[counter - 1] = array[counter];
                array[counter] = tempValue;
            }
            counter--;
        }
        start++;
        return sort(array,start);
    }

    /**
     * @param array of strings to sort with insertion sort
     * @param start of the unsorted part
     * @return sorted array of strings
     * @throws IllegalArgumentException when the arguments are not corrected
     */
    public static String[] sort(String array[], int start){

        if(array == null || start < 0 || start > array.length){
            throw new IllegalArgumentException();
        }
        
        if(start == array.length || array.length == 1){
            return array;
        }

        String tempString = "";
        int counter = start;

        while(counter > 0){
            if(array[counter-1].compareTo(array[counter]) > 0){
                tempString = array[counter-1];
                array[counter - 1] = array[counter];
                array[counter] = tempString;
            }
            counter--;
        }
        start++;
        return sort(array,start);
    }

    public static void main(String[] args){
        
    int[] values = {9,-514,3,2,343,681,0,58,2};  
        System.out.println("Before Insertion Sort");  

        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  
        System.out.println();  
        values = sort(values,0);
        System.out.println("After Insertion Sort");  
        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  

        System.out.println("\n");  
        String[] letters = {"hello","house","car","plane","bond","internet"};  
        System.out.println("Before Insertion Sort");  

        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  
        System.out.println();  
        letters = sort(letters,0);
        System.out.println("After Insertion Sort");  
        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  

        System.out.println();
    }
}