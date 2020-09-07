public class Programare extends Curs{
    private String tip;
    
    public Programare(int idd, String tipp, String denumire, int pr) {
        super(idd, denumire, pr);
        this.tip = tipp;
    }
    
    public String getTip() {
        //returnam tip-ul cursului
        return this.tip;
    }
    
    //ar trebui facut si setter dar nu cred ca are sens sa pot sa schimb tipul 
    //cursului in altcevaq decat programare daca ma aflu in clasa Programare
    
    public String toString(){
        return getId() + " " + getTip() + " " + getDen() + " " + getPret() + "lei";
    }
}