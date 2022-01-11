public class linearSearch{

    /**
     * @param arr of ints to search on
     * @param searchTerm searched int
     * @return if found, index, otherwise -1
     */
    public static int search(int[] arr, int searchTerm){
        int counter = 0;
        while(counter < arr.length){
            if(arr[counter] == searchTerm){
                return counter;
            }
            counter++;
        }
        return -1;
    }

    /**
     * @param arr of strings to search on
     * @param searchTerm searched int
     * @return if found, index, otherwise -1
     */
    public static int search(String[] arr, String searchTerm){
        int counter = 0;
        while(counter < arr.length){
            if(arr[counter].equals(searchTerm)){
                return counter;
            }
            counter++;
        }
        return -1;
    }

    public static void main(String[] args){
        
        int[] values = {-514,0,2,9,58,343,681};  
        System.out.println("Array of ints");  
        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
        }  
        System.out.println();  
        int result = search(values, 58);
        System.out.println("58 is at index " + result);  

        System.out.println("\n");  
        String[] letters = {"bond","car","hello","house","internet","plane"};  
        System.out.println("Array of strings");   

        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
        }  
        System.out.println();  
        int result2 = search(letters, "hello");
        System.out.println("hello is at index " + result2);  
    }
}