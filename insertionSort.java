public class insertionSort{

    /**
     * Iterative version of insertion sort, for array of ints.
     * @param array - array of ints to sort with insertion sort
     * @return sorted array of ints
     */
    public static int[] sort(int[] array){
        for(int i = 1; i < array.length; i++){
            //we start from 1
            int currElement = array[i];
            int counter = 0;
            for(counter = i; counter > 0 && currElement < array[counter - 1]; counter--){
                //swap if counter - 1 is greater than counter
                array[counter] = array[counter -1];
                array[counter -1] = currElement;
            }
        }
        return array;        
    }

    /**
     * Iterative version of insertion sort, for array of strings.
     * @param array - array of strings to sort with insertion sort
     * @param elementsNum - number of elements of the array
     * @return sorted array of strings
     */
    public static String[] sort(String array[]){
        for(int i = 1; i<array.length; i++){
            //we start from 1
            String currElement = array[i];
            int counter = 0;
            for(counter = i; counter > 0 && currElement.compareTo(array[counter - 1]) < 0; counter--){
                //swap if counter - 1 is greater than counter
                array[counter] = array[counter - 1];
                array[counter - 1] = currElement;
            }
        }
        return array;
    }

    public static void main(String[] args){
        
    int[] values = {9,-514,3,2,343,681,0,58,2};  
        System.out.println("Before Insertion Sort");  

        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  
        System.out.println();  
        values = sort(values);
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
        letters = sort(letters);
        System.out.println("After Insertion Sort");  
        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  

    }
}