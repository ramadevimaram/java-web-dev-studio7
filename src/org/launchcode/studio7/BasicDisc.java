package org.launchcode.studio7;

public abstract class BasicDisc {
    private String name;
    private String capacity;
    private String contents;
    private String discType;

    public BasicDisc(String name, String capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
    //TODO:properties(Files) to make:
    //Transfer rate
    //Capacity
    //Data type hold

    //todo:place these Generic behaviors in abstract class-will make into methods
    //they both spin
    //they both store data
    //data gets written to the discs by using a laser
    //the data on the discs can be read by using a laser
    //once loaded, they both report information like name,capacity,contents, and disc type
    //both can be re-writable or read only

    //Other behaviours you and your partner sorted,dicided which ones belong in the interface
    //spinning
    //reading

    //Write down details about how these behavours differ for cds and Dvds
        //Spinning -dvd spins 3 times faster a cd
        //reading - DvD offers more data to read then cd DVD includes audio and video data,cd just audio
    //diff in time it takes to read,amount of data available to read
        //writing- DVD can be written with audio files as well as video,cd can only be writen with video
                    //diff in time it takes to write,amount of data that can be written

}
