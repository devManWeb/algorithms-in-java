public class LinkedList{
    public static void main(String[] args){

        List linkList = new List();

        System.out.println("Expected: all fields null");
        System.out.println(linkList);
        System.out.println();

        linkList.addLast("1");
        linkList.addLast("2");
        linkList.addLast("3");
        linkList.addLast("4");
        System.out.println("Expected: 1 2 3 4");
        System.out.println(linkList);
        System.out.println();

        linkList.removeFirst();
        linkList.removeLast(); 
        System.out.println("Expected: 2 3");
        System.out.println(linkList);
        System.out.println();

        linkList.addFirst("0");
        linkList.addFirst("-1");
        linkList.addFirst("-2");
        linkList.addFirst("-3");
        System.out.println("Expected: -3 -2 -1 0 2 3");
        System.out.println(linkList);
        System.out.println();

        linkList.removeLast();
        linkList.removeFirst(); 
        System.out.println("Expected: -2 -1 0 2");
        System.out.println(linkList);
        System.out.println();

        System.out.println("Expected EmptyLinkedListException");
        try{
            linkList.removeLast();
            linkList.removeFirst(); 
            linkList.removeLast();
            linkList.removeFirst(); 
            linkList.removeLast();
            linkList.removeFirst(); 
        } catch(EmptyLinkedListException e){
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Expected: all fields null");
        System.out.println(linkList);

    }
}

class List{

    private Node head;  //starting node of the chain, element field null 
    private Node tail;  //starting node of the chain, element field NOT null 
    private int vSize;  //Number of nodes in the list (head is not counted) 

    /**
     * Internal class, defines a node with two fields,
     * element, stores the reference to Object to memorize
     * element, stores the reference to the next Node
     */
    public class Node{
        private Object element;
        private Node next;

        /**
         * Constructor, initializes the variables of the class to null
         */
        public Node(){
            element = null;
            next = null;
        }

        /**
         * @return Reference to the object saved on the element field 
         */
        public Object getElement(){
            return element;
        }

        /**
         * @return Reference to the next node of the chain 
         */
        public Node getNext(){
            return next;
        }

        /**
         * @param element object to save on the element field 
         */
        public void setElement(Object element){
            this.element = element;
        }

        /**
         * @param element Reference of the next node of the chain 
         */
        public void setNext(Node next){
            this.next = next;
        }

        /**
         * @return Textual representation of the node
         */
        public String toString(){
            return "[Element: " + element + ", Next ->\n" + next + "]";
        }
    }

    /**
     * Constructor of the linked list
     * Initialize an empty list
     */
    public List(){
        makeEmpty();
    }
    
    /**
     * @return true if the list is empty, false otherwise 
     */
    public boolean isEmpty(){
        return (vSize == 0);
    }

    /**
     * Empties the list.
     * The list is considered empty when both head and tail point
     * to the same Node (with null in both the element and next fields), 
     * and vSize is equal to 0.
     */
    public void makeEmpty(){
        Node temp = new Node();
        head = temp;
        tail = temp;
        vSize = 0;
    }

    /**
     * Adds a new node to the list, in the first position. 
     * On the node that was pointed to by head, add the reference to obj in the element field.
     * Performance O(1) 
     */
    public void addFirst(Object obj){
        Node n = new Node();
        n.setNext(head);
        head.setElement(obj);
        head = n;
        vSize++;
    }

    /**
     * Adds a new node to the list, in the last position. 
     * On the node that was pointed to by tail, add the reference to obj in the element field.
     * Performance O(1) 
     */
    public void addLast(Object obj){
        Node n = new Node();
        n.setElement(obj);
        tail.setNext(n);
        tail = n;
        vSize++;
    }

    /**
     * Remove the node immediately after head.
     * Performance O(1)
     * @return reference to the object that was stored 
     * in the element field of the removed node.
     */
    public Object removeFirst(){
        Object firstElem = getFirst().getElement();
        head = head.getNext();
        head.setElement(null);
        vSize--;
        return firstElem;
    }

    /**
     * Remove the node pointed to by tail.
     * Performance O(n), we need to loop through the whole list.
     * @return reference to the object that was stored 
     * in the element field of the removed node.
     */
    public Object removeLast(){
        Object lastElem = getLast().getElement();
        Node temp = head;
        while(temp.getNext() != tail){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
        vSize--;
        return lastElem;
    }

    /**
     * @return reference to the node immediately following head 
     * @throws EmptyLinkedListException if the list is empty
     */
    private Node getFirst() throws EmptyLinkedListException{
        if(isEmpty()){
            throw new EmptyLinkedListException();
        }
        return head.getNext();
    }

    /**
     * @return reference to the node pointed to by tail 
     * @throws EmptyLinkedListException if the list is empty
     */
    private Node getLast() throws EmptyLinkedListException{
        if(isEmpty()){
            throw new EmptyLinkedListException();
        }
        return tail;
    }

    /**
     * @return Textual representation of the list
     */
    public String toString(){
        return head.toString();
    }

}

/**
 * RuntimeException extension, used to to report that the list is empty 
 */
class EmptyLinkedListException extends RuntimeException{}