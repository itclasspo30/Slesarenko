package InstController;

import InstModel.*;

public class Main {

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        instruments[2] = new Violin();
        instruments[3] = new Contrabass();
        instruments[4] = new Balalaika();

        for(Instrument instrument:instruments){
            if ((instrument instanceof Soudable) && (instrument instanceof Fireable)){
            System.out.println("Instument is doing "+((Soudable)instrument).doSound()+
                    " and make some fire while "+((Fireable)instrument).getTimeOfFire()+" minutes");
            }
        }

    }
}
