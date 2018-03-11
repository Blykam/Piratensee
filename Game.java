
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game implements ITuWas
{
    private Taktgeber takt;
    private Taste t1;
    private int zustand=0;
    private Bilddatei bd_schiff;
    public Bild b_schiff;
    
    
    public Game(){
        bd_schiff = new Bilddatei("Schiff.jpg",100,100);
        b_schiff = new Bild(bd_schiff);
        
        takt = new Taktgeber();
        takt.setzeLink(this,1);

        t1 = new Taste("Anker lichten",0,0,150,60);
        t1.setzeLink(this,2);
    }

    public void tuWas(int id){
        switch(zustand){
            case 0:
                if(id==2){
                    t1.setzeAusgabetext("Anker setzen");
                    takt.endlos(0,33);
                    zustand = 1;
                } 
                break;
            case 1:
                if(id==1){
                    
                }
                if(id==2){
                    t1.setzeAusgabetext("Anker lichten");
                    takt.stop();
                    zustand = 0;
                }
                break;
        }
    }
    
    public void Bewegung(){
        int x,y,dx,dy;
        
        
    }
}
