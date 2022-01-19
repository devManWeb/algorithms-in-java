public class binarySearch{

    /**
     * @param arr of ints to search on
     * @param searchTerm searched int
     * @param start of the array
     * @param end of the array
     * @return if found, index, otherwise -1
     */
    public static int search(int[] arr, int searchTerm, int start, int end){
        if(arr == null){
            throw new IllegalArgumentException();
        }
        int middle = start + (end-start)/2;
        if(start > end){
            return -1;
        }

        if(middle == searchTerm){
            return middle;
        } else if(arr[middle] > searchTerm){
            return search(arr, searchTerm, start, middle-1);
        } else if(arr[middle] < searchTerm){
            return search(arr, searchTerm, middle+1, end);
        }
        return middle;
    }

    /**
     * @param arr of strings to search on
     * @param searchTerm searched int
     * @param start of the array
     * @param end of the array
     * @return if found, index, otherwise -1
     */
    public static int search(String[] arr, String searchTerm, int start, int end){
        if(arr == null || searchTerm == null){
            throw new IllegalArgumentException();
        }
        int middle = start + (end-start)/2;
        if(start > end){
            return -1;
        }

        if(arr[middle].equals(searchTerm)){
            return middle;
        } else if(arr[middle].compareTo(searchTerm) > 0){
            return search(arr, searchTerm, start, middle-1);
        } else if(arr[middle].compareTo(searchTerm) < 0){
            return search(arr, searchTerm, middle+1, end);
        }
        return middle;
    }

    public static void main(String[] args){
        
        int[] values = {-514,0,2,2,9,58,343,681};  
        System.out.println("Ordered array of ints");  
        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  
        System.out.println();  
        int result = search(values, 58, 0, values.length-1);
        System.out.println("58 is at index " + result);  

        System.out.println("\n");  
        String[] letters = {"bond","aaa","aaa","car","hello","house","internet","plane"};  
        System.out.println("Ordered array of strings");   

        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  
        System.out.println();  
        int result2 = search(letters, "hello", 0, letters.length-1);
        System.out.println("hello is at index " + result2);  
    }
}