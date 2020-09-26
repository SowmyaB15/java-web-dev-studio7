package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        OpticalDisc dvd = new DVD(393000000, "Titanic");
        OpticalDisc cd = new CD(13839210, "Retro Music");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        cd.play();
//        cd.stop();

        dvd.spinDisc();
        dvd.play();
//        dvd.stop();
    }
}
