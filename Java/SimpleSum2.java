public class SimpleSum2 
{
    static boolean ControlloArgomenti(int n)
    {
        if(n != 2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args)
    {
        int n = 0, x1 = 0,x2 = 0, somma = 0;

        n = args.length;

        if(!ControlloArgomenti(n))
        {
            System.out.println("Usage: java SimpleSum2 number1 number2");
        }
        else
        {
            x1 = Integer.parseInt(args[0]);
            x2 = Integer.parseInt(args[1]);
            somma = x1 + x2;

            System.out.println("La somma tra " + args[0] + " e " + args[1] + " é uguale a: " + somma);
        }
    }    
}