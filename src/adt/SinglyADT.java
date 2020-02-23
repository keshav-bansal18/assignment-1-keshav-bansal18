package adt;

public interface SinglyADT<E> {
    /*   This method will add the item in the list.
        @param item the item to be added in the list.
   */
    void add(E item);
    //This method will remove an item from the linked list.

    void remove();

    /*
          This method will search an item in the list.
          @param item the item to be searched inside the list.
        */
    int search(E item);


}
