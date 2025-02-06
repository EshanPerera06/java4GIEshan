/**
 * La classe ArrayPazienti gestisce l'inserimento, la visualizzazione e la visita dei pazienti
 * suddivisi in base al colore di priorità (rosso, giallo, verde). Utilizza tre vettori separati per
 * organizzare i pazienti in ciascuna categoria di priorità.
 * <p>
 * Ogni paziente è associato a un codice di priorità che determina l'ordine di trattamento:
 * - Codice rosso: pazienti con la massima priorità.
 * - Codice giallo: pazienti con priorità media.
 * - Codice verde: pazienti con priorità bassa.
 * </p>
 */
import java.util.*;

public class ArrayPazienti {
    
    /**
     * Vettore che contiene i pazienti con codice rosso (massima priorità).
     */
    private Vector<Paziente> pazienteRosso = new Vector<Paziente>();
    
    /**
     * Vettore che contiene i pazienti con codice giallo (priorità media).
     */
    private Vector<Paziente> pazienteGiallo = new Vector<Paziente>();
    
    /**
     * Vettore che contiene i pazienti con codice verde (priorità bassa).
     */
    private Vector<Paziente> pazienteVerde = new Vector<Paziente>();
    
    private String sesso;

    /**
     * Variabile che memorizza il colore di priorità del paziente al momento dell'inserimento.
     */
    private String colore;

    /**
     * Inserisce un nuovo paziente nella lista in base al colore di priorità scelto.
     * Il metodo chiede all'utente di inserire i dettagli del paziente (nome, cognome, età)
     * e di selezionare il colore di priorità (rosso, giallo o verde). A seconda del colore,
     * il paziente viene aggiunto al vettore corrispondente.
     */
    public void inserisciPaziente(){
        boolean uscita = false;
        String nome = ChiediDati.ChiediStringa("Inserire il nome del paziente").toUpperCase();
        String cognome = ChiediDati.ChiediStringa("Inserire il cognome del paziente").toUpperCase();
        int eta = ChiediDati.ChiediInt("Inserire l'età del paziente");

        while (!uscita){
            sesso = ChiediDati.ChiediStringa("Inserire il sesso del paziente(M/F)");
            sesso = sesso.toUpperCase();
            if(sesso.equals("M") || sesso.equals("F")){
                uscita = true;
            }
            else{
                System.out.println("Sesso non valido");
            }
        }
        uscita = false;

        String patologia = ChiediDati.ChiediStringa("Inserire la patologia del paziente");
        
        // Richiede il colore di priorità finché l'utente non inserisce un valore valido
        while(!uscita){
            colore = ChiediDati.ChiediStringa("Inserire il colore del paziente(Rosso, Giallo, Verde)");
            colore = colore.toUpperCase();
            if(colore.equals("ROSSO") || colore.equals("GIALLO") || colore.equals("VERDE")){
                uscita = true;
            } 
            else {
                System.out.println("Colore non valido");
            }
        }

        Paziente paziente = new Paziente(nome, cognome, eta, sesso, patologia, colore);

        // Aggiunge il paziente al vettore corrispondente al colore di priorità
        if(colore.equals("ROSSO")){
            pazienteRosso.addElement(paziente);
        } else if(colore.equals("GIALLO")){
            pazienteGiallo.addElement(paziente);
        } else if(colore.equals("VERDE")){
            pazienteVerde.addElement(paziente);
        }
    }
    
    /**
     * Visualizza la lista di pazienti suddivisi per colore di priorità.
     * Vengono stampati a schermo i dettagli dei pazienti per ciascun codice di priorità:
     * - Codice rosso
     * - Codice giallo
     * - Codice verde
     */
    public void visualizzaPazienti(){
        // Visualizza i pazienti con codice rosso
        System.out.println("Pazienti in codice rosso:");
        for(int i = 0; i < pazienteRosso.size(); i++){
            System.out.println("\t-Nome: " + pazienteRosso.elementAt(i).getNome() + 
                               "; Cognome: " + pazienteRosso.elementAt(i).getCognome() + 
                               "; Età: " + pazienteRosso.elementAt(i).getEta());
        }

        // Visualizza i pazienti con codice giallo
        System.out.println("Pazienti in codice giallo:");
        for(int i = 0; i < pazienteGiallo.size(); i++){
            System.out.println("\t-Nome: " + pazienteGiallo.elementAt(i).getNome() + 
                               "; Cognome: " + pazienteGiallo.elementAt(i).getCognome() + 
                               "; Età: " + pazienteGiallo.elementAt(i).getEta());
        }

        // Visualizza i pazienti con codice verde
        System.out.println("Pazienti in codice verde:");
        for(int i = 0; i < pazienteVerde.size(); i++){
            System.out.println("\t-Nome: " + pazienteVerde.elementAt(i).getNome() + 
                               "; Cognome: " + pazienteVerde.elementAt(i).getCognome() + 
                               "; Età: " + pazienteVerde.elementAt(i).getEta());
        }
    }

    /**
     * Esegue la visita del paziente con la priorità più alta. 
     * Il paziente con codice rosso viene trattato per primo, seguito dai pazienti con codice giallo
     * e infine dai pazienti con codice verde.
     * Viene rimosso il primo paziente della lista del colore corrispondente alla priorità.
     */
    public void visitaPaziente(){
        // Visita il paziente con codice rosso se presente
        if(pazienteRosso.size() > 0){
            pazienteRosso.removeElementAt(0);
        }
        // Visita il paziente con codice giallo se non ci sono pazienti con codice rosso
        else if(pazienteGiallo.size() > 0){
            pazienteGiallo.removeElementAt(0);
        }
        // Visita il paziente con codice verde se non ci sono pazienti con codice rosso o giallo
        else if(pazienteVerde.size() > 0){
            pazienteVerde.removeElementAt(0);
        }
    }
}