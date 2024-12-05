import java.util.Scanner;

public class IntegerSum
{
    public static void main(String[] args)
    {
        int x1 = 0, x2 = 0, tot= 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire il primo numero: ");
        x1 = (scan.nextInt());
        
        System.out.println("Inserire il secondo numero: ");
        x2 = (scan.nextInt());

        tot = x1 + x2;

        System.out.println("La somma tra \"" + x1 + "\" e \"" + x2 + "\" fa: " + tot);
    }    
}
