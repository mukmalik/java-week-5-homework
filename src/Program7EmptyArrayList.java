import java.util.ArrayList;

public class Program7EmptyArrayList {

    public static void arrayList() {
        //Declare the variable of array list
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("\nOriginal array list : " + c1);//Print Original arraylist
        System.out.println("\nChecking arraylist is empty?: " + c1.isEmpty());//Checking Arraylist is empty or not
        c1.removeAll(c1);
        System.out.println("\nArray List after remove all elements : " + c1);//print after removal of elemets
        System.out.println("\nChecking the above array list is empty? :  " + c1.isEmpty());//Checking Arraylist is empty or not


    }

    public static void main(String[] args)
    {
        arrayList();

    }
}
