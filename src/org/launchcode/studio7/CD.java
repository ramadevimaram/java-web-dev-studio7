package org.launchcode.studio7;

public class CD extends BasicDisc implements OpticalDisk{

    public CD(String name, String capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("cd disc ");
    }

    @Override
    public void storeData() {
        System.out.println("cd data");
    }

    @Override
    public void readData() {
        System.out.println("cd read");
    }

    @Override
    public void writeData() {
        System.out.println("cd write");
    }
    //Generic behaviors
    //they both spin
    //they both store data
    //data gets written to the discs by using a laser
    //the data on the discs can be read by using a laser
    //once loaded, they both report information like name,capacity,contents, and disc type
    //both can be re-writable or read only

    //differences
    //transfer rate slower then DVD
    //Capacity will be more then DVD
    //More details in data,holds
    //Audio data
    //video data
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    //Files to make
    //Transfer rate
    //Capacity
    //Data type hold

}
