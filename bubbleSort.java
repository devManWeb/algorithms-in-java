public class bubbleSort{

    /**
     * Iterative version of bubble sort, for array of ints.
     * @param array - array of ints to sort with bubble sort
     * @return sorted array of ints
     */
    public static int[] sort(int[] array){
        if(array == null){
            throw new IllegalArgumentException();
        }
        int sorted = 0;  //num of already sorted elements
        for(int i = 0; i < array.length - 1; i++){
            for(int ii = 0; ii < array.length - 1 - sorted; ii++){
                int temp;
                if(array[ii] > array[ii+1]){
                    temp = array[ii+1];
                    array[ii+1] = array[ii];
                    array[ii] = temp;
                }
            }
        }   
        return array;
    }

    /**
     * Iterative version of bubble sort, for array of strings.
     * @param array - array of strings to sort with bubble sort
     * @param elementsNum - number of elements of the array
     * @return sorted array of strings
     */
    public static String[] sort(String array[]){
        if(array == null){
            throw new IllegalArgumentException();
        }
        int sorted = 0;
        for(int i= 0; i < array.length - 1; i++){
            for(int ii= 0; ii < array.length - 1 - sorted; ii++){
                String temp;
                if(array[ii].compareTo(array[ii+1]) > 0){
                    temp = array[ii+1];
                    array[ii+1] = array[ii];
                    array[ii] = temp;
                }
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
        String[] letters = {"hello","car","house","car","plane","bond","internet","aaaa"};  
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

        System.out.println();

    }
}