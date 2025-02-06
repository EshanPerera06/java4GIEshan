/**
 * La classe Paziente rappresenta un paziente all'interno del sistema, con informazioni
 * personali come nome, cognome, età e un codice identificativo assegnato dall'ospedale.
 * La classe fornisce i metodi per accedere ai dettagli del paziente.
 */
public class Paziente {
    
    /**
     * Il nome del paziente.
     */
    private String nome;
    
    /**
     * Il cognome del paziente.
     */
    private String cognome;
    
    /**
     * L'età del paziente.
     */
    private int eta;

    private String sesso;
    
    private String patologia;

    /**
     * Il codice identificativo del paziente all'interno dell'ospedale.
     */
    private String codiceOspedale;

    /**
     * Costruttore per inizializzare un nuovo oggetto Paziente con le informazioni fornite.
     * 
     * @param nome Il nome del paziente.
     * @param cognome Il cognome del paziente.
     * @param eta L'età del paziente.
     * @param codiceOspedale Il codice identificativo del paziente assegnato dall'ospedale.
     */
    public Paziente(String nome, String cognome, int eta,String sesso, String patologia, String codiceOspedale) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sesso = sesso;
        this.patologia = patologia;
        this.codiceOspedale = codiceOspedale;
    }
    
    /**
     * Restituisce il nome del paziente.
     * 
     * @return Il nome del paziente.
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Restituisce il cognome del paziente.
     * 
     * @return Il cognome del paziente.
     */
    public String getCognome(){
        return cognome;
    }
    
    /**
     * Restituisce l'età del paziente.
     * 
     * @return L'età del paziente.
     */
    public int getEta(){
        return eta;
    }
    
    /**
     * Restituisce il codice identificativo del paziente nell'ospedale.
     * 
     * @return Il codice ospedaliero del paziente.
     */
    public String getCodiceOspedale(){
        return codiceOspedale;
    }
}
