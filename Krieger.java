
/**
 * Beschreiben Sie hier die Klasse Krieger.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Krieger extends Mensch
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Gegenstand[] rucksack;
    private int grundAusdauer;
    private int aktuelleAusdauer;
    

    /**
     * Konstruktor für Objekte der Klasse Krieger
     */
    public Krieger(String pName, int pAlter, char pGeschlecht)
    {
        // Instanzvariable initialisieren
        super(pName,pAlter,pGeschlecht);
        grundAusdauer = 90;
        rucksack = new Gegenstand[10];
        rucksack[0] = new Fackel();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getAktuelleAusdauer()
    {
        // tragen Sie hier den Code ein
        return aktuelleAusdauer;
    }
    
    public void setAktuelleAusdauer(int pAktuelleAusdauer)
    {
        aktuelleAusdauer = pAktuelleAusdauer;
    }
}
