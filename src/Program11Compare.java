import java.util.ArrayList;

public class Program11Compare
{
    public static void arrayCompare() {
        ArrayList<String> c1 = new ArrayList<String>();
        ArrayList<String> c2 = new ArrayList<String>();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)) {
            System.out.println("Arraylist are equals");
        } else {
            System.out.println("Arraylist are not equal");
        }
    }

    public static void main(String[] args) {
        arrayCompare();
    }
}
