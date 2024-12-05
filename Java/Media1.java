import java.lang.Scanner;

public class Media1 
{
    public static float Media(Float n, Float cont)
    {
        float media = 0;

        media = n/cont;

        return media;
    }

    public static boolean ControlloMedia(Float cont)
    {
        if(cont == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static float[] input()
    {
        char x = "";
        float n = 0, cont = 0;
        float[] lista = {0, 0};

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire i valori di cui si vuole sapere la media, finire l'inserimento dei valori con \"x\":");

        while(x != "x")
        {
            x = scan.nextLine();

            if ((x != "x") && (x >= 30 || x <= 39))
            {
                n += Float.parseFloat(x);
                cont += 1;
            }
            else
            {
                System.out.println("Il valore inserito non è valido, inserire nuovamente un valore:");
            }

        }
        lista[0] = n;
        lista[1] = cont;

        return lista;
    }

    public static void main(String[] args)
    {
        float n = 0, cont = 0, media = 0;
        float[] lista = {0, 0};
        boolean controllo;

        lista = input();
        n = lista[0];
        cont = lista[1];

        controllo =  ControlloMedia(cont);

        if(controllo)
        {
            media = Media(n, cont);

            System.out.println("La media dei numeri immessi è: " + media);
        }
        else
        {
            System.out.println("Non sono stati immessi dei valori.");
        }
    }
    
}
