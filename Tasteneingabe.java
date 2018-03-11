
/**
 * Write a description of class Tasteneingabe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tasteneingabe implements ITastatur
{
    private Tastatur tt;
    
    //globaler String der Tasteneingabe
    public String te_1;

    public Tasteneingabe(){
        tt = new Tastatur();
        tt.setzeLink(this);
        
        //Anmeldung der Pfeil-,WASD- und Leertaste[n]
        tt.tstRichtung();
        tt.meldeAnTaste("pressed W", "W");
        tt.meldeAnTaste("pressed A", "A");
        tt.meldeAnTaste("pressed S", "S");
        tt.meldeAnTaste("pressed D", "D");
        tt.meldeAnTaste("pressed SPACE","Leertaste");
    }

    public void tastenAktion(String rückgabe){
        System.out.println(rückgabe);
        te_1 = rückgabe;
    }
}
