import java.lang.*;
import java.util.*;
import java.util.Scanner.*;

public class Examen {
    public static void main(String[] args){
        //citim de la tastatura comenzile
        Scanner tastatura = new Scanner(System.in);
        String citire;
        
        System.out.println("In urmatoarea institutie se pot adauga urmatoarele" + 
        "cursuri(maxim 30):\n" + "-Programare;\n" + "-LimbiStraine;\n" +
        "Selectati o optiune:\n" + "-adauga_curs <tip> <denumire> <pret>;\n" + "-afisare;\n" + 
        "-afisare_cursuri_programare;\n" + "-sterge_curs <id_curs>\n" + "-exit;\n");
        
        int pret, id;
        String denumire;
        String tip;
        String comanda;
        String []bucati;
        
        Institutie inst = new Institutie();
        Fir firdeexec = new Fir(inst);
        firdeexec.start();
        
        while(true) {
            citire = tastatura.nextLine();
            bucati = citire.split("\\s+");
            
            switch(bucati[0]){
                case "exit" :
                    System.out.println("IESIRE DIN APLICATIE");
                    System.exit(0);
                break;
                case "adauga_curs" :
                    System.out.println("-------------------------Adaugare Curs\n");
                    
                    tip = bucati[1];
                    denumire = bucati[2];
                    pret = Integer.parseInt(bucati[3]);
                    inst.adaugaCurs(tip,denumire,pret);
   
                break;
                case "afisare" :
                    inst.afisare();
                break;
                case "afisare_cursuri_programare" :
                    inst.afisareProgramare();
                break;
                case "sterge_curs" :
                    if(inst.c.size() != 0){
                    System.out.println("-------------------------Stergere Curs\n");
                    id = Integer.parseInt(bucati[1]);
                    inst.stergeCurs(id);}
                    else {
                        System.out.println("Nu exista cursuri");
                    }
                break;
                
                default: System.out.println("Sintaxa gresita, incearca inca o data!\n");
            }
        }
        
    }
}