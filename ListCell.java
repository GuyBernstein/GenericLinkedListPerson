package QuestionOne;/*
 * The ListCell class represents a single cell in a linked list. It contains the cell content
 * and a reference to the next cell in the list. It is a generic class that allows storing
 * elements of any type.
 */

public class ListCell<E> {

    private E cellContent;
    private ListCell<E> nextCell; // the pointer to the next cell in the list
    public ListCell(E cellContent) {
        this.cellContent = cellContent;
        this.nextCell = null;
    }
    public ListCell(E cellContent,ListCell<E> nextCell) {
        this.cellContent = cellContent;
        this.nextCell = nextCell;
    }
    // Getter for cellContent
    public E getCellContent() {
        return cellContent;
    }

    // Setter for cellContent
    public void setCellContent(E cellContent) {
        this.cellContent = cellContent;
    }

    // Getter for nextCell
    public ListCell<E> getNextCell() {
        return nextCell;
    }

    // Setter for nextCell
    public void setNextCell(ListCell<E> nextCell) {
        this.nextCell = nextCell;
    }
}