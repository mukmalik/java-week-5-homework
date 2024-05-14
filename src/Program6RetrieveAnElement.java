import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program6RetrieveAnElement {

    public static void colourRetrieve() {
        // Create a list and add some colors to the list
        List<String> Color = new ArrayList<String>();
        Color.add("Red");
        Color.add("Green");
        Color.add("Orange");
        Color.add("White");
        Color.add("Black");
        // Print the list
        System.out.println(Color);

        Scanner obj = new Scanner(System.in);
        System.out.println("\nEnter the array position you want to be printed (0-4) : ");
        int x = obj.nextInt();
        // Retrieving the element for that position
        String element = Color.get(x);
        System.out.println("First element: " + element);
    }

    public static void main(String[] args) {
        colourRetrieve();
    }

}
