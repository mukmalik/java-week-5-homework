package calculate;

public class Calculator {

    public void addition(int a, int b)
    {
        int result;
        result=a+b;
        System.out.println("addition of a + b is :  " + result);
    }

    public void subtraction(int a, int b)
    {
        int result;
        result = a-b;
        System.out.println("subtraction of a-b is : " +result);
    }

    public void division(int a, int b)
    {
        int result;
        result = a/b;
        System.out.println("division of a/b is : " + result);
    }

    public void multiplication(int a, int b)
    {
        int result = a*b;
        System.out.println("multiplication of a * b is : "+result);
    }

    public void calculateResult(int a, int b, char c)
    {

        if (c == '+')
        {
           addition(a,b);
        }
        else if (c == '-')
        {
            subtraction(a,b);
        }
        else if (c == '/')
        {
            division(a,b);
        }

        else if (c == '*')
        {
            multiplication(a,b);
        }
        else
        {
            System.out.println("Invalid operator ");
        }


    }
}
