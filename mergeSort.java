public class mergeSort{

    /**
     * @param unsorted array of ints
     * @return sorted array of ints
     */
    public static int[] sort(int[] array){
        if(array.length == 1){
            return array;
        }
        int middle = array.length / 2;

        int[] subArrayA = new int[middle];
        for(int i = 0; i < middle; i++){
            subArrayA[i] = array[i];
        }
        int[] subArrayB = new int[array.length - middle];
        int counter = 0;
        for(int i = middle; i < array.length; i++){
            subArrayB[counter++] = array[i];
        }
        sort(subArrayA);
        sort(subArrayB);
        return merge(array, subArrayA, subArrayB, middle, array.length - middle);
    }

    /**
     * @param unsorted array of strings
     * @return sorted array of strings
     */
    public static String[] sort(String[] array){
        if(array.length == 1){
            return array;
        }
        int middle = array.length / 2;

        String[] subArrayA = new String[middle];
        for(int i = 0; i < middle; i++){
            subArrayA[i] = array[i];
        }
        String[] subArrayB = new String[array.length - middle];
        int counter = 0;
        for(int i = middle; i < array.length; i++){
            subArrayB[counter++] = array[i];
        }
        sort(subArrayA);
        sort(subArrayB);
        return merge(array, subArrayA, subArrayB, middle, array.length - middle);
    }

    /**
     * @param baseArray final array of ints to return sorted
     * @param subArrayA unsorted array of ints to join with the other
     * @param subArrayB unsorted array of ints to join with the other
     * @param number of elements off subArrayA 
     * @param number of elements off subArrayB
     * @return sorted array of ints
     */
    public static int[] merge(int[] baseArray, int[] subArrayA, int[] subArrayB, int aSize, int bSize){
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (counter1 < aSize && counter2 < bSize) {
            if (subArrayA[counter1] <= subArrayB[counter2]) {
                baseArray[counter3++] = subArrayA[counter1++];
            }
            else {
                baseArray[counter3++] = subArrayB[counter2++];
            }
        }
        //executed only one of the two, empties the temporary array 
        while (counter1 < aSize) {
            baseArray[counter3++] = subArrayA[counter1++];
        }
        while (counter2 < bSize) {
            baseArray[counter3++] = subArrayB[counter2++];
        }
        return baseArray;
    }

    /**
     * @param baseArray final array of strings to return sorted
     * @param subArrayA unsorted array of strings to join with the other
     * @param subArrayB unsorted array of strings to join with the other
     * @param aSize number of elements off subArrayA 
     * @param bSize number of elements off subArrayB
     * @return sorted array of strings
     */
    public static String[] merge(String[] baseArray, String[] subArrayA, String[] subArrayB, int aSize, int bSize){
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (counter1 < aSize && counter2 < bSize) {
            if (subArrayA[counter1].compareTo(subArrayB[counter2]) <= 0) {
                baseArray[counter3++] = subArrayA[counter1++];
            }
            else {
                baseArray[counter3++] = subArrayB[counter2++];
            }
        }
        //executed only one of the two, empties the temporary array 
        while (counter1 < aSize) {
            baseArray[counter3++] = subArrayA[counter1++];
        }
        while (counter2 < bSize) {
            baseArray[counter3++] = subArrayB[counter2++];
        }
        return baseArray;
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