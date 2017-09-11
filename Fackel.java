
/**
 * Beschreiben Sie hier die Klasse Fackel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fackel extends Gegenstand
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private double brennDauer;
    private boolean fackelAn;

    /**
     * Konstruktor für Objekte der Klasse Fackel
     */
    public Fackel()
    {
        // Instanzvariable initialisieren
        super("Fackel",20.8, 5.6,true);
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public double getBrennDauer()
    {
        // tragen Sie hier den Code ein
        return brennDauer;
    }
    
    public void setBrennDauer(double pBrennDauer)
    {
        // tragen Sie hier den Code ein
        brennDauer = pBrennDauer;
    }
    
      public boolean getFackelAn()
    {
        // tragen Sie hier den Code ein
        return fackelAn;
    }
    
    public void setFackelAn(boolean pFackelAn)
    {
        // tragen Sie hier den Code ein
        fackelAn = pFackelAn;
    }
    
    public void brennen()
    {
        brennDauer = brennDauer - 0.1;
    }
}
