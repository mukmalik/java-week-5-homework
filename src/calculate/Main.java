package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args)
    {


        Scanner obj = new Scanner(System.in);
        char r = 'Y';

        while(r == 'Y')

        {

            System.out.print("Enter First number : ");
            int x = obj.nextInt();
            System.out.print("Enter second number : ");
            int y = obj.nextInt();

            System.out.println("choose an operator + or - or * or /  ");
            char z = (char) obj.next().charAt(0);
            Main Call = new Main();
            Call.calculateResult(x,y,z);


            System.out.println("Would you like to do more calculation - Please enter Yes or No   :  ");

            r = obj.next().charAt(0);
            System.out.println(" print option"+r);


            if(r == 'N')
            {
                break;
            }
        }
        obj.close();

    }

}
