
/**
 * Beschreiben Sie hier die Klasse Gegenstand.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gegenstand
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private double gewicht;
    private double groesse;
    private String name;
    private boolean brennbar;

    /**
     * Konstruktor für Objekte der Klasse Gegenstand
     */
    public Gegenstand()
    {
        // Instanzvariable initialisieren
    }
    
    /**
     * Konstruktor für Objekte der Klasse Gegenstand
     */
    public Gegenstand(String pName, double pGewicht, double pGroesse, boolean pBrennbar)
    {
        // Instanzvariable initialisieren
        name = pName;
        gewicht = pGewicht;
        groesse = pGroesse;
        brennbar = pBrennbar;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
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
    
     public double getGewicht()
    {
        // tragen Sie hier den Code ein
        return gewicht;
    }
    
     public void setGewicht(double pGewicht)
    {
        // tragen Sie hier den Code ein
        gewicht = pGewicht;
    }
    
     public double getGroesse()
    {
        // tragen Sie hier den Code ein
        return groesse;
    }
    
     public void setGroesse(double pGroesse)
    {
        // tragen Sie hier den Code ein
        groesse = pGroesse;
    }
    
     public boolean getBrennbar()
    {
        // tragen Sie hier den Code ein
        return brennbar;
    }
    
     public void setBrennbar(boolean pBrennbar)
    {
        // tragen Sie hier den Code ein
        brennbar = pBrennbar;
    }
}
