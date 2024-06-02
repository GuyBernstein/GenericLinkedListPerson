package QuestionOne;/*
 * The LinkedList class represents a linked list data structure. It contains a reference to
 * the head and tail of the list. It provides methods to add elements to the list, remove
 * elements from the list, and retrieve the head and tail of the list. It also overrides
 * the toString method to provide a readable representation of the list contents.
 */

public class LinkedList<E> {
    private ListCell<E> head;
    private ListCell<E> tail;
    public LinkedList(){
        head = null;
        tail = null;
    }
    // Getter for head
    public ListCell<E> getHead() {
        return head;
    }

    // Getter for tail
    public ListCell<E> getTail() {
        return tail;
    }

    public void add(E content){
        ListCell<E> temp = new ListCell<E>(content);
        if (head == null) {
            head = temp;
        } else {
            tail.setNextCell(temp);
        }
        tail = temp;
    }

    public E remove() throws EmptyListException{
        if (head == null) {
            throw new EmptyListException();
        }
        E content  = head.getCellContent();
        head = head.getNextCell();
        if (head == null) {
            tail = null;
        }
        return content;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListCell<E> temp = head;
        while (temp != null) {
            sb.append(String.format("\"%s\"", temp.getCellContent()));
            temp = temp.getNextCell();
            if (temp != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return String.format("The list contains: %s%n", sb);
    }

}
