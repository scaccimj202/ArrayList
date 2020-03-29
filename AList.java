/**
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *assignment 4b
 *description: ArrayList data structure, modeled after Data Structures
 *and Algorithim Analysis by Clifford Shaffer Chapter 4.1.1
 */

 public class ArrayList<E> implements List<E>{

    private static final int defaultSize = 10;
    private int maxSize;
    private int listSize;
    private int currentPosition;
    private E[] listArray;

    /**
     * Constructor with list default capacity
     */
    ArrayList(){
        this(defaultSize);
    }
    
    /**
     * Constructor with new list object
     * @param size the maxSize of the ArrayList
     */
    @SuppressWarnings("unchecked")
    ArrayList(int size){
        maxSize = size;
        listSize = currentPosition = 0;
        listArray = (E[]) new Object[size];
    }

    /**
     * Method clears the list
     */
    public void clear(){
        listSize = currentPosition = 0;
    }

    /**
     * Method inserts element into ArrayList at current position.
     * @param element the element to be inserted into the ArrayList
     */
    public void insert(E element){
        assert listSize < maxSize : "List capacity exceeded";
        for(int i = listSize; i>currentPosition; i--)
            listArray[i] = listArray[i-1];
        listArray[currentPosition] = element;
        listSize++;
    }
    