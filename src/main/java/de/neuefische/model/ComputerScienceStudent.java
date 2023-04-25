package de.neuefische.model;

public class ComputerScienceStudent extends Student {
    private int getProgramingIQ;

    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String name, int id, int getProgramingIQ) {
        super(name, id);
        this.getProgramingIQ = getProgramingIQ;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "getProgramingIQ=" + getProgramingIQ +
                "} " + super.toString();
    }

    public int getGetProgramingIQ() {
        return getProgramingIQ;
    }


    public void setGetProgramingIQ(int getProgramingIQ) {
        this.getProgramingIQ = getProgramingIQ;
    }
}
