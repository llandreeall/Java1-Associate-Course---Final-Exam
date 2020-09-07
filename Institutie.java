import java.lang.*;
import java.util.*;

public class Institutie{
    public static Institutie SINGLETON;
    ArrayList<Curs> c = null;
    
    public Institutie(){
        //facem lista de cursuri
        c = new ArrayList<>();
    }
    
    public void adaugaCurs(String t, String d, int p){
        int identif;
        //adaugam cursul in lista
        if(c.size() <= 30) {
            identif = c.size() + 1;
            
            if(t.equals("Programare")) { 
                Programare prog = new Programare(identif, t, d, p);
                c.add(prog);
                System.out.println("Curs de " + t + " adaugat cu succes!");
            } else if(t.equals("LimbiStraine")) {
                LimbiStraine ls = new LimbiStraine(identif, t, d, p);
                c.add(ls);
                System.out.println("Curs de " + t + " adaugat cu succes!");
            } else
            System.out.println("Momentan institutia nu ofera decat cursuri de Programare si LimbiStraine.");}
        else {throw new Exceptie();}
    }
    
    public void afisare(){
        if(c.size() != 0){
            System.out.println("-------------------------Lista cu cursuri\n");
            System.out.println("Id Tip    Denumire    Pret\n");
            c.stream().forEach(c -> System.out.println(c));
        } else 
            System.out.println("Nu exista cursuri");
    }
    
    public void afisareProgramare(){
        if(c.size() != 0){
            System.out.println("-------------------------Lista cu cursuri de Programare\n");
            System.out.println("Id Tip    Denumire    Pret\n");
            for(Curs i : c) {
                if(i instanceof Programare) {
                    System.out.println(i); }
            }
        } else 
            System.out.println("Nu exista cursuri");
    }
    
    public void stergeCurs(int j){
        if(c.size() != 0){
            for(int i = 0; i < c.size(); i++) {
                if(c.get(i).getId() == j) {
                    c.remove(i);
                    System.out.println("Cursul a fost sters cu succes!");
                }
            }
        } else 
            System.out.println("Nu exista cursuri");
    }
    
    public static final Institutie getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Institutie();
        }
        return SINGLETON;
    }
}