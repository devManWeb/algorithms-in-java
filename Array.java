public class Array{
    private int[] intMemory;
    private String[] stringMemory;
    private int intSize;
    private int stringSize;

    public Array(){
        intMemory = new int[1];
        stringMemory = new String[1];
        intSize = 0;
        stringSize = 0;
    }

    /**
     * private method, doubles the size of the array 
     * @param array of ints
     * @return array of ints
     */
    private int[] resize(int[] array){
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    /**
     * private method, doubles the size of the array 
     * @param array of strings
     * @return array of strings
     */
    private String[] resize(String[] array){
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    /**
     * private method, sort the array with insertion sort 
     * @param array of ints
     * @param number of elements
     * @return array of strings
     */
    private int[] sort(int[] array, int number){
        if (number>1){
            sort(array, number-1);
        }
        int temp = array[number-1];
        int counter = number-2;
        while (counter >= 0 && array[counter] > temp){
            array[counter + 1] = array[counter];
            counter = counter-1;
        } 
        array[counter+1] = temp;
        return array;
    }
    /**
     * private method, sort the array with insertion sort 
     * @param array of strings
     * @param number of elements
     * @return array of strings
     */
    private String[] sort(String[] array, int number){
        if (number>1){
            sort(array, number-1);
        }
        String temp = array[number-1];
        int counter = number-2;
        while (counter >= 0 && array[counter].compareTo(temp) > 0){
            array[counter + 1] = array[counter];
            counter = counter-1;
        } 
        array[counter+1] = temp;
        return array;
    }
    /**
     * @param number int to add
     */
    public void add(int number){
        if(intMemory.length == intSize){
            intMemory = resize(intMemory);
        }
        intMemory[intSize++] = number;    
        sort(intMemory,intSize);
    }
    /**
     * @param text string to add
     */
    public void add(String text){
        if(stringMemory.length == stringSize){
            stringMemory = resize(stringMemory);
        }
        stringMemory[stringSize++] = text;  
        sort(stringMemory,stringSize);
    }
    /**
     * private method, gives us the value saved at the given index
     * @param array of ints
     * @param index of the array
     * @return desired int
     * @throws IllegalArgumentException if the given index does not exist
     * @throws EmptyArrayException if the array is empty
     */
    private int get(int[] array, int index) throws IllegalArgumentException, EmptyArrayException{
        if(index > intSize || index < 0){
            throw new IllegalArgumentException();
        }
        if(intSize == 0){
            throw new EmptyArrayException();
        }
        return array[index];
    }
    /**
     * private method, gives us the value saved at the given index
     * @param array of strings
     * @param index of the array
     * @return desired string
     * @throws IllegalArgumentException if the given index does not exist
     * @throws EmptyArrayException if the array is empty
     */
    private String get(String[] array, int index) throws IllegalArgumentException, EmptyArrayException{
        if(index > intSize || index < 0){
            throw new IllegalArgumentException();
        }
        if(stringSize == 0){
            throw new EmptyArrayException();
        }
        return array[index];
    }
    /**
     * @param isInteger true if we need to remove an int, false otherwise
     * @param index of the array
     */
    public void remove(Boolean isInteger, int index){
        try{
            if(isInteger){
                //bring the element to be removed at the bottom 
                //get checks if the array is empty 
                int toRemove = get(intMemory,index);
                int lastElem = get(intMemory,intSize-1);
                intMemory[intSize-1] = toRemove;
                intMemory[index] = lastElem;
                intSize--;
                sort(intMemory,intSize);
            } else {
                String toRemove = get(stringMemory,index);
                String lastElem = get(stringMemory,stringSize-1);
                stringMemory[stringSize-1] = toRemove;
                stringMemory[index] = lastElem;
                stringSize--;
                sort(stringMemory,stringSize);
            }
        } catch(IllegalArgumentException e){
            System.exit(1);
        } catch(EmptyArrayException e){
            System.exit(1);
        }
    }
    /**
     * @return array of saved ints
     */
    public int[] getInts(){
        int[] array = new int[intSize];
        System.arraycopy(intMemory, 0, array, 0, intSize);
        return array;
    }    
    /**
    * @return array of saved strings
    */
    public String[] getStrings(){
        String[] array = new String[stringSize];
        System.arraycopy(stringMemory, 0, array, 0, stringSize);
        return array;
    }
}

//Custom made exception
class EmptyArrayException extends RuntimeException{}