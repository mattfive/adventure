
/**
 * Beschreiben Sie hier die Klasse Mensch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mensch
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int alter;
    private char geschlecht;
    private String name;

    /**
     * Konstruktor für Objekte der Klasse Mensch
     */
    public Mensch(String pName, int pAlter, char pGeschlecht)
    {
        // Instanzvariable initialisieren
        name = pName;
        alter = pAlter;
        geschlecht = pGeschlecht;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getAlter()
    {
        // tragen Sie hier den Code ein
        return alter;
    }
    
     public void setAlter(int pAlter)
    {
        // tragen Sie hier den Code ein
        alter = pAlter;
    }
    
     public String getName()
    {
        // tragen Sie hier den Code ein
        return name;
    }
    
     public void setName(String pName)
    {
        // tragen Sie hier den Code ein
        name = pName;
    }
    
     public char getGeschlecht()
    {
        // tragen Sie hier den Code ein
        return geschlecht;
    }
    
     public void setGeschlecht(char pGeschlecht)
    {
        // tragen Sie hier den Code ein
        geschlecht = pGeschlecht;
    }
}
