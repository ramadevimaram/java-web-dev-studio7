package org.launchcode.studio7;

public class DVD extends BasicDisc implements OpticalDisk {
    public DVD(String name, String capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD Spin");
    }

    @Override
    public void storeData() {
        System.out.println("DVD store data");
    }

    @Override
    public void readData() {
        System.out.println("Dvd read");

    }

    @Override
    public void writeData() {
        System.out.println("DVD write");

    }
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
