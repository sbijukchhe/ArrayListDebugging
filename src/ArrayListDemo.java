/*
The following code demonstrates using the ArrayList. It adds several items to the list, shows the list, removes some
items, and displays the list again. Or at least it should. This code doesn't work. It won't compile. Find the errors
and fix it:

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create an arraylist
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // Add elements to the arraylist
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.sizes());

        // Display the arraylist
        System.out.println("Contents of al: " + al);

        // Removes elements from the arraylist
        al.remove("F");
        al.remove("G");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.sizes());
        System.out.println("Contents of al: " + al);
    }
}
 */

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an arraylist
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // Add elements to the arraylist
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());

        // Display the arraylist
        System.out.println("Contents of al: " + al);

        // Removes elements from the arraylist
        al.remove("F");
        al.remove("G");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}
