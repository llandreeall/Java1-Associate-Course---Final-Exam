import java.util.*;
public class Curs{
    private int pret,id;
    private String den;
    
    public Curs(int idd, String denumire, int prr) {
        this.id = idd;
        this.pret = prr;
        this.den = denumire;
    }
    
    public int getId() {
        //returnam id-ul cursului
        return this.id;
    }
    
    public int getPret() {
        //returnam pretul cursului
        return this.pret;
    }
    
    public String getDen() {
        //returnam denumirea cursului
        return this.den;
    }
    
    public void setPret(int pr) {
        //schimbam valoarea pretului
        this.pret = pr;
    }
    
    public void setDen(String num) {
        //schimbam valoarea denumirii
        this.den = num;
    }
    
    public void setId(int idd) {
        //schimbam valoarea id-ului
        this.id = idd;
    }
}