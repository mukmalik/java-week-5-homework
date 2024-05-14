import java.util.Arrays;
import java.util.Scanner;

public class Program3ArrayReverse {

    public static void arrayReverse() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n = sc.nextInt();
        //creates an array in the memory of length 10


        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            //reading array elements from the user
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            // Swap the elements at positions 'i' and 'length - i - 1'.
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // Print the reversed array using Arrays.toString() method.
        System.out.println("Reverse array : " + Arrays.toString(array));


    }

    public static void main(String[] args)
    {
arrayReverse();
    }
}
