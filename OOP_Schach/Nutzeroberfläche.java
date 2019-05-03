
/**
 * Beschreiben Sie hier die Klasse Nutzeroberfläche.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nutzeroberfläche
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private Accountmanagement accountmanagement;
    
    /**
     * Konstruktor für Objekte der Klasse Nutzeroberfläche
     */
    public Nutzeroberfläche()
    {
        // Instanzvariable initialisieren
        x = 0;
    }
    
    public Accountmanagement accountmanagement(String username, String passwort, boolean newAccount) {
        if(newAccount) {
            return CreateAccount(username,passwort);
        }
        else {
            return Login(username, passwort);
        }
    
    }
}
