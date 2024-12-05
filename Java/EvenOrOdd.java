public class EvenOrOdd 
{
    //Creo il metodo per capire se un numero è pari o dispari
    static boolean isEven(int n)
    {
        if(n%2 == 0)    //Se il resto della divisione è 0 allora è pari e ritorna "true"
        {
            return true;
        }
        else    //Se il resto è diverso da zero allora è dispari e ritorna "false"
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        if(isEven(10))  //condizione per capire se il numero immesso è pari o dispari, con annessa stampa del risultato
        {
            System.out.println("Il numero è pari");
        }
        else
        {
            System.out.println("Il numero è dispari");
        }
    }    
}
