package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    private static int minSpinRate = 570;
    private static int maxSpinRate = 1600;

    public DVD(int storage, String name) {
        super(storage, name);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + minSpinRate + "-" + maxSpinRate + " rpm.");
    }

    @Override
    public void play() {
        System.out.println("Playing the DVD");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the play list");
    }

    @Override
    public void writeData(){

    }

    @Override
    public void readData(){

    }
}
