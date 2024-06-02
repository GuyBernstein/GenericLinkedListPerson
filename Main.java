package QuestionOne; /**
 * Made by Guy Bernstein
 * i.d 206558439
 *  The Main class serves as the entry point of the program. It demonstrates the usage of
 * the LinkedList class and its methods. It prompts the user to enter a number of strings,
 * adds them to a linked list, and performs operations such as reversing the list and
 * finding the most elderly person in a list of Person objects. It also handles exceptions
 * that may occur during the execution of the program.
 */

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static final int NUMBER_OF_STRINGS = 6;

    public static void main(String[] args) {
        //the linked list to be tested
        LinkedList<String> ls = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[NUMBER_OF_STRINGS];

        //input the user for NUMBER_OF_STRINGS strings
        System.out.println("Enter " + NUMBER_OF_STRINGS + " strings:");

        //prepare the input into an array of strings
        for (int i = 0; i < NUMBER_OF_STRINGS; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        //add the strings into the linked list
        for (String str : strings) {
            ls.add(str);
        }
        //print the strings
        System.out.printf("%nList of Strings: %s", ls);
        // Create a new list lsRev and add the elements, then print in reverse order
        LinkedList<String> lsRev = reverseList(ls);//new list in reverse order

        //print the strings in reverse order
        System.out.printf("%nReverse order list: %s%n", lsRev);

        // Create a linked list of Person objects
        LinkedList<Person> personList = new LinkedList<Person>();

        // Create and add Person objects to the list
        personList.add(new Person("Alice", 1, 1990));
        personList.add(new Person("Bob", 2, 1985));
        personList.add(new Person("Charlie", 3, 1995));
        personList.add(new Person("David", 4, 1980));

        //print the Persons
        System.out.printf("%nList of Persons: %s", personList);

        // Print the most elderly person using the max method
        try {
            Person elderlyPerson = max(personList);
            System.out.println("\nThe most elderly person is: " + elderlyPerson);
        } catch (EmptyListException e) {
            System.out.println("The person list is empty.");
        }
        scanner.close();
    }
    //A helper function to copy and reverse the original list into a reversed list
    private static <E> LinkedList<E> reverseList(LinkedList<E> originalList) {
        LinkedList<E> reversedList = new LinkedList<E>();
        Stack<E> stack = new Stack<E>();// a helper stack for reversing the list.

        while (originalList.getHead() != null) {
            try {
                E content = originalList.remove();
                stack.push(content);
            } catch (EmptyListException e) {
                System.out.println("Cannot transfer from an empty list: " + e.getMessage());
                break;
            }
        }

        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }

        return reversedList;
    }
    public static <E extends Comparable<E>>  E max(LinkedList<E> list) throws EmptyListException{
        if (list == null || list.getHead() == null) {
            throw new EmptyListException();
        }

        ListCell<E> current = list.getHead();
        E maxElement = current.getCellContent();

        while (current != null) {
            E currentElement = current.getCellContent();
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
            current = current.getNextCell();
        }

        return maxElement;
    }


}

