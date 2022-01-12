public class dynamicArray{
    public static void main(String[] args){
        
        Array mem = new Array();
    
        int[] values = {9,-514,3,2,343,681,0,58,2};  
        for(int i=0; i < values.length; i++){  
            System.out.print(values[i]+" ");  
            mem.add(values[i]);
        } 
        System.out.println();     
        for(int i=0; i < mem.getInts().length; i++){  
            System.out.print(mem.getInts()[i]+" ");  
        } 
        mem.remove(true,1);
        mem.remove(true,5);
        System.out.println();     
        for(int i=0; i < mem.getInts().length; i++){  
            System.out.print(mem.getInts()[i]+" ");  
        }
    
        System.out.println();  

        String[] letters = {"hello","house","car","plane","bond","internet"};  
        for(int i=0; i < letters.length; i++){  
            System.out.print(letters[i]+" ");  
            mem.add(letters[i]);
        }  
        System.out.println();  
        for(int i=0; i < mem.getStrings().length; i++){  
            System.out.print(mem.getStrings()[i]+" ");  
        }
        mem.remove(false,1);
        mem.remove(false,5);
        System.out.println();  
        for(int i=0; i < mem.getStrings().length; i++){  
            System.out.print(mem.getStrings()[i]+" ");  
        }

        mem.remove(false,12);
        //this is not executed
        System.out.println();  
        for(int i=0; i < mem.getStrings().length; i++){  
            System.out.print(mem.getStrings()[i]+" ");  
        }
    }
}
