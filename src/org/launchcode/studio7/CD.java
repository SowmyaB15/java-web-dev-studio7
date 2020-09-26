package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private static int minSpinRate = 200;
    private static int maxSpinRate = 500;

    public CD (int storage, String name) {
        super(storage, name);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + minSpinRate + "-" + maxSpinRate + " rpm.");
    }

    @Override
    public void play() {
        System.out.println("Playing the CD");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the play list");
    }

    public void goToNextTrack() {
        System.out.println("Playing next track");
    }

    public void goToPreviousTrack() {
        System.out.println("Playing previous track");
    }

    public void shuffle() {
        System.out.println("Shuffling the play list");
    }

    @Override
    public void writeData(){

    }

    @Override
    public void readData(){

    }
}
