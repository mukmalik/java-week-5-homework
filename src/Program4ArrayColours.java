import java.util.Scanner;

public class Program4ArrayColours {

    public static void arrayColours()
    {
        Scanner obj = new Scanner(System.in);
        //reading the number of elements from the that we want to enter
        System.out.print("Enter the number of elements you want to store: ");
        int n = obj.nextInt();
        String array[] = new String[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            //reading array elements from the user
            array[i] = obj.nextLine();
        }


        System.out.print("Array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        arrayColours();
    }
}
