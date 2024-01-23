public class ExceptionHandling {
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Divide By Zero Exception "+e);
        }
    }
}

class ArrayException
{
    public static void main(String[] args)
    {
        try
        {
            int A[] = {10,0,2,6,7};
            int r = A[0]/A[2];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }

    }
}
