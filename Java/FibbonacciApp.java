import java.util.Scanner;
import java.util.Scanner;

/**
 * La classe FibbonacciApp calcola e stampa il numero di Fibonacci 
 * corrispondente alla posizione fornita dall'utente.
 */
public class FibbonacciApp {

    /**
     * Calcola il numero di Fibonacci corrispondente alla posizione 'n'.
     * 
     * @param n La posizione nella sequenza di Fibonacci (un numero intero non negativo).
     * @return Il numero di Fibonacci alla posizione 'n'.
     */
    private static int valoreSequenza(int n) {
        int a = 1;  // F(1) inizialmente
        int b = 0;  // F(0) inizialmente
        int ris = 0; // Variabile per il risultato

        // Se n è 0, il risultato è 0 (F(0))
        if (n == 0) {
            return 0;
        } else {
            // Ciclo per calcolare il numero di Fibonacci alla posizione n
            for (int i = 0; i < n; i++) {
                ris = a + b; // La somma dei due numeri precedenti dà il numero corrente
                b = a; // Sposta a in b (b diventa F(i-1))
                a = ris; // Sposta ris in a (a diventa F(i))
            }
            return ris; // Restituisce il risultato (F(n))
        }
    }

    /**
     * Metodo principale che gestisce l'input dell'utente e visualizza il risultato.
     * 
     * @param args Argomenti della linea di comando (non utilizzati in questo caso).
     */
    public static void main(String[] args) {
        int n = 0;  // La posizione della sequenza di Fibonacci che l'utente vuole conoscere
        int ris = 0; // Il risultato finale

        // Creazione di un oggetto Scanner per leggere l'input dell'utente
        Scanner scan = new Scanner(System.in);

        // Richiesta dell'input da parte dell'utente
        System.out.print("Inserisci la posizione del numero della sequenza di Fibbonacci che vuoi sapere: ");
        n = scan.nextInt();  // Legge l'intero inserito dall'utente

        // Chiamata al metodo valoreSequenza per calcolare il numero di Fibonacci
        ris = valoreSequenza(n);

        // Stampa del risultato
        System.out.println("Il numero di Fibonacci in posizione " + n + " è: " + ris);

        // Chiusura dello scanner per liberare le risorse
        scan.close();
    }
}
