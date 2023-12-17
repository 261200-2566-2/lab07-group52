import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a newSet instance
        newSet<String> mySet = new newSet<>();

        // Add elements to the set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Banana");
        mySet.add("Orange");

        // Print size and contents
        System.out.println("Set size: " + mySet.size());
        System.out.println("Contains 'Banana': " + mySet.contains("Banana"));

        // Print all elements in the set
        System.out.println("Elements in the set:");
        for (String element : mySet) {
            System.out.println(element);
        }

        // Remove an element
        mySet.remove("Apple");

        // Print updated size and contents
        System.out.println("Updated set size: " + mySet.size());
        System.out.println("Contains 'Apple': " + mySet.contains("Apple"));

        // Test containsAll
        List<String> otherList = Arrays.asList("Banana", "Grapes");
        System.out.println("Contains all elements: " + mySet.containsAll(otherList));

        // Add multiple elements
        mySet.addAll(otherList);

        // Print updated size and contents
        System.out.println("Updated set size: " + mySet.size());
        System.out.println("Contains all elements: " + mySet.containsAll(otherList));

        // Print all elements in the set
        System.out.println("Elements in the set:");
        for (String element : mySet) {
            System.out.println(element);
        }

        //Test retainAll
        List<String> l = Arrays.asList("Banana", "Grapes");
        System.out.println("Retains all elements: " + mySet.retainAll(l));

        // Print all elements in the set
        System.out.println("Elements in the set:");
        for (String element : mySet) {
            System.out.println(element);
        }

        // Clear the set
        mySet.clear();

        // Print final size
        System.out.println("Final set size: " + mySet.size());
    }
}