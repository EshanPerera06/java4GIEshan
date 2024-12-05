import java.util.Scanner;

public class FactorialApp 
{
    static int factorial(int n)
    {
        if(n >= 1)
        {
            return (n * factorial(n-1));
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        int n = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire un numero di cui si vuole sapere il fattoriale:");
        n = (scan.nextInt());

        n=factorial(n);
        System.out.println("Il fattoriale è uguale a: " + n);
    }    
}