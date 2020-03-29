/**
*@author Matthew Scaccia
*course CIS303
*@since 3/29/2020
*assignment 4b
*description: List Interface, modeled after Data Structures
*and Algorithim Analysis by Clifford Shaffer Chapter 4.1
*/

public interface List<E>{
    
    /**
     * Remove all items from list
     */
    public void clear();

    /**
     * Insert item into list at current location. Client 
     * is responsible for NOT overflowing list capacity.
     * @param item element to be inserted into list.
     */
    public void insert(E item);

    /**
     * Append an item to the end ot the list. Client is responsible
     * for NOT overflowing the list capcaity.
     * @param item element to be append to the end of the list.
     */
    public void append(E item);

    /**
     * Remove the current element and return it.
     * @return element that was removed.
     */
    public E remove();

    /**
     * Moves the current position to the start of the list.
     */
    public void moveToStart();

    /**
     * Move the current position to the end of the list.
     */
    public void moveToEnd();

    /**
     * Move current position one interval to the left. 
     * If at the beginning, no change.
     */
    public void prev();

    /**
     * Move the current position one interval to the right.
     * If at the end, no change.
     */
    public void next();

    /**
     * Returns the number of elements in the list.
     * @return the number of elements in the list.
     */
    public int length();

    /**
     * Returns the position of the current element.
     * @return the position of the current element.
     */
    public int currPos();

    /**
     * Moves current position from its *current* position to the value passed.
     * @param post the position to be moved to.
     */
    public void moveToPos(int post);

    /**
     * Return the current element.
     * @return the current element.
     */
    public E getValue();
}