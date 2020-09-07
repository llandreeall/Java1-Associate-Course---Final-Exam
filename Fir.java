public class Fir extends Thread{
    Institutie i;
    public Fir(Institutie inst)
    {
        i = inst;
    }
    
    @Override
    public void run(){
        while(true) {
            try{
                System.out.println(i.c.size() + " cursuri\n");
                Thread.sleep(120000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}