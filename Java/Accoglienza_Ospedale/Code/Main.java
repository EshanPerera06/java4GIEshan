/**
 * La classe Main è il punto di ingresso principale dell'applicazione e gestisce il flusso di operazioni
 * tramite un menu interattivo. Consente di eseguire operazioni relative ai pazienti, come l'inserimento
 * di nuovi pazienti, la visualizzazione di tutti i pazienti e l'uscita dall'applicazione.
 * Il programma continua a eseguire queste operazioni finché l'utente non sceglie di uscire.
 */
public class Main {
    
    /**
     * Variabile che memorizza la scelta dell'utente nel menu.
     */
    private static int scelta = 0;
    
    /**
     * Oggetto che rappresenta il menu dell'applicazione e gestisce l'interazione con l'utente.
     */
    private static Menu menu = new Menu();
    
    /**
     * Oggetto che rappresenta l'elenco dei pazienti.
     */
    private static ArrayPazienti pazienti = new ArrayPazienti();
    
    /**
     * Variabile booleana che determina se il programma deve terminare o continuare a funzionare.
     */
    private static boolean uscita = false;
    
    /**
     * Variabile contatore utilizzata per eseguire la visita ai pazienti ogni 3 iterazioni del ciclo principale.
     */
    private static int i = 0;

    /**
     * Metodo principale che gestisce l'esecuzione del programma. Il ciclo continua finché l'utente non decide di uscire.
     * Ogni iterazione del ciclo visualizza il menu e chiede all'utente di inserire una scelta per eseguire un'operazione.
     * Le operazioni disponibili includono l'inserimento di un nuovo paziente, la visualizzazione dei pazienti esistenti,
     * e l'uscita dall'applicazione.
     * Inoltre, ogni 3 iterazioni del ciclo, viene eseguita una visita ai pazienti.
     * 
     * @param args Argomenti passati alla funzione main (non utilizzati in questo caso).
     */
    public static void main(String[] args) {
        // Ciclo che continua finché l'utente non decide di uscire
        while(!uscita){
            // Visualizza il menu
            menu.visualizzaMenu();
            // Chiede all'utente di inserire una scelta
            scelta = ChiediDati.ChiediInt("Inserire il numero corrispondente all'operazione desiderata");
            System.out.println("\n______________________________________________________________________\n\n");
            
            // Esegue l'operazione in base alla scelta dell'utente
            switch(scelta){
                case 1:
                    // Inserisce un nuovo paziente
                    pazienti.inserisciPaziente();
                    System.out.println("\n______________________________________________________________________\n\n");
                    break;
                case 2:
                    // Visualizza i pazienti esistenti
                    pazienti.visualizzaPazienti();
                    System.out.println("\n______________________________________________________________________\n\n");
                    break;
                case 3:
                    // Esce dal programma
                    uscita = true;
                    System.out.println("Arrivederci!\n\n");
                    break;
                default:
                    // Gestisce una scelta non valida
                    System.out.println("Scelta non valida");
                    System.out.println("\n______________________________________________________________________\n\n");
            }
            
            // Ogni 3 iterazioni esegue una visita ai pazienti
            if((i % 3 == 0) && (i != 0)){
                pazienti.visitaPaziente();
            }

            // Incrementa il contatore delle iterazioni
            i++;
        }
    }
}
