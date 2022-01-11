public class selectionSort{

    /**
     * @param array of ints to sort with selection sort
     * @param start of the unsorted part
     * @return sorted array of ints
     */
    public static int[] sortInts(int[] array, int start){
        if(array.length == 1 || start == array.length-1){
            return array;
        }

        int minIndex = start;
        for(int i=start; i<array.length; i++){
            if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }

        int temp = array[start];
        array[start] = array[minIndex];
        array[minIndex] = temp;
        start++;
        return sortInts(array,start);
    }

    /**
     * @param array of strings to sort with selection sort
     * @param start of the unsorted part
     * @return sorted array of strings
     */
    public static String[] sortStrings(String array[], int start){
        
        if(array.length == 1 || start == array.length-1){
            return array;
        }

        int minIndex = start;
        for(int i=start; i<array.length; i++){
            if(array[i].compareTo(array[minIndex]) < 0){
                minIndex = i;
            }
        }

        String temp = array[start];
        array[start] = array[minIndex];
        array[minIndex] = temp;
        start++;
        return sortStrings(array,start);
    }

    public static void main(String[] args){
        
        int[] values = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  

        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  
        System.out.println();  
        values = sortInts(values,0);
        System.out.println("After Selection Sort");  
        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  

        System.out.println("\n");  
        String[] letters = {"hello","house","car","plane","bond","internet"};  
        System.out.println("Before Selection Sort");  

        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  
        System.out.println();  
        letters = sortStrings(letters,0);
        System.out.println("After Selection Sort");  
        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  

    }
}