
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

    public Game(){
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
}
