package de.neuefische.model;

public class ComputerScienceStudent extends Student implements Citizen{
    private int getProgramingIQ;

    private int IdentityCardNumber;

    private String Address;

    private int IQValue;

    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String name, int id, int getProgramingIQ) {
        super(name, id);
        this.getProgramingIQ = getProgramingIQ;
    }

    @Override
    public void setIQValue(int IQValue) {
        this.IQValue = IQValue;
    }
    @Override
    public int getIQValue(){
        return this.IQValue;
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

    void setAddress(String Address){
        this.Address = Address;
    }
    void setIdentityCardNumber(int IdentityCardNumber){
        this.IdentityCardNumber = IdentityCardNumber;
    }

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public int getIdentityCardNumber() {
        return IdentityCardNumber;
    }
}
