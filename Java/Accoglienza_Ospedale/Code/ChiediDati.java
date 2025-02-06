/**
 * La classe ChiediDati fornisce metodi statici per acquisire input dall'utente attraverso la console.
 * Essa gestisce la lettura di stringhe, numeri interi e numeri decimali, fornendo messaggi di errore
 * e chiedendo all'utente di ripetere l'inserimento in caso di formato non valido.
 * <p>
 * La classe include i seguenti metodi per richiedere dati:
 * - ChiediStringa: per acquisire una stringa dall'utente.
 * - ChiediInt: per acquisire un intero dall'utente.
 * - ChiediDouble: per acquisire un valore decimale (double) dall'utente.
 * </p>
 */
import java.io.*;

public class ChiediDati
{
    /**
     * Costante che rappresenta un valore intero impossibile, utilizzato come valore di default
     * in caso di errore nel tentativo di acquisire un intero.
     */
    public static final int INTERO_IMPOSSIBILE = 1000000001;

    /**
     * Costante che rappresenta un valore double impossibile, utilizzato come valore di default
     * in caso di errore nel tentativo di acquisire un double.
     */
    public static final double REALE_IMPOSSIBILE = -0.000000000000000000000000000000000000000000000000001;

    /**
     * Richiede all'utente di inserire una stringa. Se l'input non è valido, il programma chiederà
     * di ripetere l'inserimento finché non si otterrà una stringa valida.
     * 
     * @param messaggio Il messaggio da mostrare all'utente prima dell'inserimento.
     * @return La stringa inserita dall'utente.
     */
    public static String ChiediStringa(String messaggio) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        String inserimento = "";

        boolean uscita = false;
        while (!uscita) {
            System.out.print(messaggio + ": ");
            try {
                inserimento = tastiera.readLine();
                uscita = true;
            } catch (Exception e) {
                System.out.println("La stringa inserita non è in formato corretto; ripetere l'inserimento" + "\n\n");
            }
        }
        return inserimento;
    }

    /**
     * Richiede all'utente di inserire un numero intero. Se l'input non è un intero valido,
     * il programma chiederà di ripetere l'inserimento finché non si otterrà un numero intero valido.
     * 
     * @param messaggio Il messaggio da mostrare all'utente prima dell'inserimento.
     * @return Il numero intero inserito dall'utente.
     */
    public static int ChiediInt(String messaggio) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        String inserimento = "";
        int intero = INTERO_IMPOSSIBILE;

        boolean uscita = false;
        while (!uscita) {
            System.out.print(messaggio + ": ");
            try {
                inserimento = tastiera.readLine();
                intero = Integer.parseInt(inserimento);
                uscita = true;
            } catch (Exception e) {
                System.out.println("La stringa inserita non è in formato intero; ripetere l'inserimento" + "\n\n");
            }
        }
        return intero;
    }

    /**
     * Richiede all'utente di inserire un numero decimale (double). Se l'input non è un numero valido,
     * il programma chiederà di ripetere l'inserimento finché non si otterrà un valore decimale valido.
     * 
     * @param messaggio Il messaggio da mostrare all'utente prima dell'inserimento.
     * @return Il numero decimale (double) inserito dall'utente.
     */
    public static double ChiediDouble(String messaggio) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        String inserimento = "";
        double reale = REALE_IMPOSSIBILE;

        boolean uscita = false;
        while (!uscita) {
            System.out.print(messaggio + ": ");
            try {
                inserimento = tastiera.readLine();
                reale = Double.parseDouble(inserimento);
                uscita = true;
            } catch (Exception e) {
                System.out.println("La stringa inserita non è in formato double; ripetere l'inserimento" + "\n\n");
            }
        }
        return reale;
    }
}
