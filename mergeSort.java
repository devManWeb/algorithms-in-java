public class mergeSort{

    /**
     * @param array - unsorted array of ints
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
        return merge(array, subArrayA, subArrayB);
    }

    /**
     * @param array - unsorted array of strings
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
        return merge(array, subArrayA, subArrayB);
    }

    /**
     * @param baseArray - final array of ints to return sorted
     * @param subArrayA - unsorted array of ints to join with the other
     * @param subArrayB - unsorted array of ints to join with the other
     * @return sorted array of ints
     */
    public static int[] merge(int[] finalArray, int[] subArrayA, int[] subArrayB){
        int counterFinal = 0;
        int counterA = 0;
        int counterB = 0;
        while (counterA < subArrayA.length && counterB < subArrayB.length) {
            if (subArrayA[counterA] <= subArrayB[counterB]) {
                finalArray[counterFinal++] = subArrayA[counterA++];
            }
            else {
                finalArray[counterFinal++] = subArrayB[counterB++];
            }
        }
        //empties the temporary array 
        while (counterA < subArrayA.length) {
            finalArray[counterFinal++] = subArrayA[counterA++];
        }
        while (counterB < subArrayB.length) {
            finalArray[counterFinal++] = subArrayB[counterB++];
        }
        return finalArray;
    }

    /**
     * @param baseArray - final array of strings to return sorted
     * @param subArrayA - unsorted array of strings to join with the other
     * @param subArrayB - unsorted array of strings to join with the other
     * @return sorted array of strings
     */
    public static String[] merge(String[] finalArray, String[] subArrayA, String[] subArrayB){
        int counterFinal = 0;
        int counterA = 0;
        int counterB = 0;
        while (counterA < subArrayA.length && counterB < subArrayB.length) {
            if (subArrayA[counterA].compareTo(subArrayB[counterB]) <= 0) {
                finalArray[counterFinal++] = subArrayA[counterA++];
            }
            else {
                finalArray[counterFinal++] = subArrayB[counterB++];
            }
        }
        //empties the temporary array 
        while (counterA < subArrayA.length) {
            finalArray[counterFinal++] = subArrayA[counterA++];
        }
        while (counterB < subArrayB.length) {
            finalArray[counterFinal++] = subArrayB[counterB++];
        }
        return finalArray;
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