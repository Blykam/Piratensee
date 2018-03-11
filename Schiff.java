/**
 * Write a description of class Schiff here.
 *
 * @author (Stefan Sattler)
 * @version (0.1)
 */
public class Schiff
{
    private Bilddatei bd_schiff;
    
    //globales Bild
    public Bild b_schiff;
    
    public Schiff(){
        //Erzeuge Bildobjekt aus Bilddatei Schiff.jpg
        bd_schiff = new Bilddatei("Schiff.jpg",100,100);
        b_schiff = new Bild(bd_schiff);
    }
}
