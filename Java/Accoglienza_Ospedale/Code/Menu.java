/**
 * La classe Menu gestisce la visualizzazione del menu delle operazioni disponibili per l'utente.
 * Essa fornisce un metodo per stampare a schermo le opzioni tra cui l'utente può scegliere,
 * come inserire un paziente, visualizzare la lista dei pazienti o uscire dal programma.
 */
public class Menu {
    
    /**
     * Visualizza il menu con le opzioni disponibili per l'utente.
     * Il menu include le seguenti opzioni:
     * 1. Inserisci un paziente
     * 2. Visualizza la lista dei pazienti
     * 3. Esci
     */
    public void visualizzaMenu(){
        System.out.print("Ecco una lista delle funzioni disponibili:\n" +
                            "1. Inserisci un paziente\n" +
                            "2. Visualizza la lista dei pazienti\n" +
                            "3. Esci\n");
    }
}
